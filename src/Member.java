/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the Superclass Member it handles all of the basic information PremiumMember
 * will inherit.
 *
 * @author Alexander Tekleab
 */
public class Member {

    // creating private fields
    private String firstName;
    private String lastName;
    private int memberId;
    private double balance;
    private double amountSpent;

    /**
     * This is a Member constructor with it's passed in value, String, String,
     * int, double.
     *
     * @param firstName - This parameter is setting Member's first name, String.
     * @param lastName - This parameter is setting Member's last name, String.
     * @param memberId - This parameter is setting Member's ID, int.
     * @param balance - This parameter is setting Member's balance, double.
     */
    public Member(String firstName, String lastName, int memberId, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.balance = balance;
    }

    /**
     * This is a getter for the private field "firstName", its a getter that
     * reads the value of "firstName".
     *
     * @return - It returns the First name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is a getter for the private field "lastName", its a getter that
     * reads the value of "lastName".
     *
     * @return - It returns the Last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is a getter for the private field "memberId", its a getter that
     * reads the value of "memberId".
     *
     * @return - It returns the Member ID.
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * This is a getter for the private field "balance", its a getter that reads
     * the value of "balance".
     *
     * @return - It returns the balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This is a getter for the private field "amountSpent", its a getter that
     * reads the value of "amountSpent".
     *
     * @return - It returns the Amount spent.
     */
    public double getAmountSpent() {
        return amountSpent;
    }

    /**
     * This is a setter for the private field "firstName", it's a setter that
     * updates value of "firstName".
     *
     * @param firstName - Uses the firstName parameter to set the First name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is a setter for the private field "lastName", it's a setter that
     * updates value of "lastName".
     *
     * @param lastName - Uses the firstName parameter to set the First name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is a setter for the private field "memberId", it's a setter that
     * updates value of "memberId".
     *
     * @param memberId - Uses the memberId parameter to set the Member ID.
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    /**
     * This is a setter for the private field "balance", it's a setter that
     * updates value of "balance".
     *
     * @param balance - Uses the balance parameter to set the balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * This is a setter for the private field "amountSpent", it's a setter that
     * updates value of "amountSpent".
     *
     * @param amountSpent - Uses the amountSpent parameter to set the Amount
     * spent.
     */
    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of Member.
     *
     * @return - It returns the properties of Member.
     */
    @Override
    public String toString() {
        return "First name: " + firstName + ", Last name: " + lastName + ", Member ID: "
                + memberId + ", Balance: $" + balance;

    }

    /**
     * This is a stub method to see how long a member has been a member for.
     */
    public void memberDays() {

    }

}
