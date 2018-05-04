package DAO;

import java.sql.SQLException;

public class TransactionDAO extends AbstractDAO {

    public void getTransactionsbyZipcode(int zip, int month, int year) {

        try {
            getConnection();
            ps = conn.prepareStatement(query.getDisplayCustomersTransactionsByZip());
            ps.setInt(1, zip);
            ps.setInt(2, month);
            ps.setInt(3, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("TRANSACTION_ID") + ": "
                        + rs.getString("MONTH") + "/"
                        + rs.getString("DAY") + "/"
                        + rs.getString("YEAR"));
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//get transactions by zipcode

    public void getNumberAndTotalByType(String type) {
        try {
            getConnection();
            ps = conn.prepareStatement(query.getDisplayNumberOfTransactionsAndTotalTransactionAmountByType());
            ps.setString(1, type);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("Number") + ", " + rs.getDouble("Total"));
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//get number and total for a given type

    public void getNumberAndTotalByState(String state) {
        try {
            getConnection();
            ps = conn.prepareStatement(query.getDisplayNumberOfTransactionsAndTotalTransactionAmountByState());
            ps.setString(1, state);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("Number") + ", " + rs.getDouble("Total"));
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//get number and total for a given state

}
