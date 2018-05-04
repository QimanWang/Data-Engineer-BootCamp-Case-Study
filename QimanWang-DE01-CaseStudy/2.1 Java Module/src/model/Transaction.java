package model;

public class Transaction {
    int transcationID;
    int day;
    int month;
    int year;
    String creditCardNo;
    int custSSN;
    int branchCode;
    String transactionType;
    double transactionValue;

    public Transaction(int transcationID, int day, int month, int year, String creditCardNo, int custSSN, int branchCode, String transactionType, double transactionValue) {
        this.transcationID = transcationID;
        this.day = day;
        this.month = month;
        this.year = year;
        this.creditCardNo = creditCardNo;
        this.custSSN = custSSN;
        this.branchCode = branchCode;
        this.transactionType = transactionType;
        this.transactionValue = transactionValue;
    }

    public int getTranscationID() {
        return transcationID;
    }

    public void setTranscationID(int transcationID) {
        this.transcationID = transcationID;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public int getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(int custSSN) {
        this.custSSN = custSSN;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }

    @Override
    public String toString() {

        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Transcation ID:" + transcationID + "\n" +
                "Date: " + day + "/" + month + "/" + year + "\n" +
                "CustomerSSN:" + custSSN + "\n" +
                "CreditCard Num:" + creditCardNo + "\n" +
                "Branch Code:" + branchCode + "\n" +
                "TransactionType:" + transactionType + "\n" +
                "TransactionValue:" + transactionValue + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    }
}
