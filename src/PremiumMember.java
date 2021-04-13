/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the class PremiumMember a subclass of Member with it's own unique set of identifiers.
 *
 * @author Alexander Tekleab
 */
public class PremiumMember extends Member {

    // creating private fields
    private String paymentMethod;
    private double monthlyFee;
    private boolean feePaidOnTime;

    /**
     * This is a PremiumMember constructor with it's passed in value, String,
     * String, int, double, String.
     *
     * @param firstName - This parameter is setting Member's first name, String.
     * @param lastName - This parameter is setting Member's last name, String.
     * @param memberId - This parameter is setting Member's ID, int.
     * @param balance - This parameter is setting Member's balance, double.
     * @param paymentMethod - This parameter is setting Member's payment method,
     * double.
     */
    public PremiumMember(String firstName, String lastName, int memberId, double balance, String paymentMethod) {
        super(firstName, lastName, memberId, balance);
        this.paymentMethod = paymentMethod;
        this.monthlyFee = 10.0;
    }

    /**
     * This is a getter for the private field "paymentMethod", its a getter that
     * reads the value of "paymentMethod".
     *
     * @return - It returns String Payment method.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * This is a getter for the private field "monthlyFee", its a getter that
     * reads the value of "monthlyFee".
     *
     * @return - It returns a double Monthly fee.
     */
    public double getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * This is a getter for the private field "feePaidOnTime", its a getter that
     * reads the value of "feePaidOnTime".
     *
     * @return - It returns a Boolean whether fee is paid on time.
     */
    public boolean isFeePaidOnTime() {
        return feePaidOnTime;
    }

    /**
     * This is a setter for the private field "paymentMethod", it's a setter
     * that updates value of "paymentMethod".
     *
     * @param paymentMethod - Uses the String paymentMethod parameter to set the
     * Payment method.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * This is a setter for the private field "monthlyFee", it's a setter that
     * updates value of "monthlyFee".
     *
     * @param monthlyFee - Uses the double monthlyFee parameter to set the
     * Monthly Fee.
     */
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /**
     * This is a setter for the private field "feePaidOnTime", it's a setter
     * that updates value of "feePaidOnTime".
     *
     * @param feePaidOnTime - Uses the Boolean feePaidOnTime parameter to set
     * whether fee is paid on time.
     */
    public void setFeePaidOnTime(boolean feePaidOnTime) {
        this.feePaidOnTime = feePaidOnTime;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of Premium Member.
     *
     * @return - It returns the properties of Premium Member.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += ", Payment method: " + paymentMethod;
        return result;

    }

    /**
     * This is a stub method for Premium Member who shop continuously at the
     * book store, and they earn loyalty points for their loyalty.
     */
    public void premiumMemberLoyaltyPoints() {

    }

}
