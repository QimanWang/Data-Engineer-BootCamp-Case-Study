package DAO;

import model.Customer;
import model.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends AbstractDAO {

    public Customer getCustomerDetails(int id) {
        try {
            getConnection();
            ps = conn.prepareStatement(query.getCustDetails());
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (!rs.next()) {
                System.out.println("NO RESULTS");
            }//no result

            rs.previous();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setFirstName(rs.getString(1));
                customer.setMiddleName(rs.getString(2));
                customer.setLastName(rs.getString(3));
                customer.setAccountID(rs.getLong(4));
                customer.setCreditCardNo(rs.getString(5));
                customer.setAptNo(rs.getString(6));
                customer.setStreetName(rs.getString(7));
                customer.setCity(rs.getString(8));
                customer.setState(rs.getString(9));
                customer.setCountry(rs.getString(10));
                customer.setZip(rs.getString(11));
                customer.setEmail(rs.getString(13));
                customer.setPhone(rs.getLong(12));
                System.out.println(customer);
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return new Customer();
    }//get customer info

    public void modifyCustomerDetails(String field, String value, long id) {
        try {
            getConnection();
            ps = conn.prepareStatement(query.getModifyCustomerDetailsPrefix() + field + query.getModifyCustomerDetailsSuffix());

            if (field.equals("CUST_PHONE")) {
                ps.setLong(1, Long.parseLong(value));
            } else {
                ps.setString(1, value);
            }
            ps.setLong(2, id);
            ps.executeUpdate();
            System.out.println("Entry has been Updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//modify customer info

    public void generateBill(String cardNo, int month, int year) {
        try {
            getConnection();
            ps = conn.prepareStatement(query.getGenerateMonthlyBill());
            ps.setString(1, cardNo);
            ps.setInt(2, month);
            ps.setInt(3, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("MONTHLY BILL: " + rs.getDouble("BILL"));
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//generate bill

    public void displayTransBetweenDates(int id, int startYear, int endYear, int startMonth,
                                         int endMonth, int startDay, int endDay) {

        try {
            getConnection();
            ps = conn.prepareStatement(query.getDisplayCustomerTransactionsBetweenTwoDate());
            ps.setInt(1, id);
            ps.setInt(2, startYear);
            ps.setInt(3, endYear);
            ps.setInt(4, startMonth);
            ps.setInt(5, endMonth);
            ps.setInt(6, startDay);
            ps.setInt(7, endDay);
            rs = ps.executeQuery();
            List<Transaction> transactionList = new ArrayList<>();
            while (rs.next()) {
                int transaction_id = rs.getInt("TRANSACTION_ID");
                int day = rs.getInt("DAY");
                int month = rs.getInt("MONTH");
                int year = rs.getInt("YEAR");
                String creditCardNo = rs.getString("CREDIT_CARD_NO");
                int custSSN = rs.getInt("CUST_SSN");
                int branchCode = rs.getInt("BRANCH_CODE");
                String transType = rs.getString("TRANSACTION_TYPE");
                double tranVal = rs.getDouble("TRANSACTION_VALUE");
                transactionList.add(new Transaction(transaction_id, day, month,
                        year, creditCardNo, custSSN,
                        branchCode, transType, tranVal));
            }
            for (Transaction t : transactionList) {
                System.out.println(t);
            }
            closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//display transactions between 2 days

}
