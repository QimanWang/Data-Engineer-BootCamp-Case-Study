package model;

public class Customer {

    String firstName;
    String middleName;
    String lastName;
    long accountID;
    String CreditCardNo;
    String streetName;
    String aptNo;
    String city;
    String state;
    String country;
    String zip;
    String email;
    long phone;

    public Customer() {
    }

    public Customer(String firstName, String middleName, String lastName, long accountID, String creditCardNo, String streetName, String aptNo, String city, String state, String country, String zip, String email, long phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.accountID = accountID;
        CreditCardNo = creditCardNo;
        this.streetName = streetName;
        this.aptNo = aptNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getCreditCardNo() {
        return CreditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        CreditCardNo = creditCardNo;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Customer Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                "AccountID: " + accountID + "\n" +
                "CreditCardNo: " + CreditCardNo + "\n" +
                "Address: " + aptNo + " " + streetName + " " + "\n" +
                "        " + city + ", " + state + " " + zip + " " + country + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phone + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }


}
