/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the Superclass Product it handles all of the basic information CD,
 * DVD, Book, will inherit.
 *
 * @author Alexander Tekleab
 */
public class Product {

    // creating private fields
    private String name;
    private int productId;
    private double price;

    /**
     * This is a Product constructor with it's passed in value, String, int,
     * double.
     *
     * @param name - This parameter is setting Product's name, String.
     * @param productId - This parameter is setting Product's ID, int.
     * @param price - This parameter is setting Product's price, double.
     */
    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    /**
     * This is a getter for the private field "name", its a getter that reads
     * the value of "name".
     *
     * @return - It returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * This is a getter for the private field "productId", its a getter that
     * reads the value of "productId".
     *
     * @return - It returns the product ID.
     */
    public int getProductId() {
        return productId;
    }

    /**
     * This is a getter for the private field "price", its a getter that reads
     * the value of "price".
     *
     * @return - It returns the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * This is a setter for the private field "name", it's a setter that updates
     * value of "name".
     *
     * @param name - Uses the name parameter to set the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is a setter for the private field "productId", it's a setter that
     * updates value of "productId".
     *
     * @param productId - Uses the productId parameter to set the product ID.
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * This is a setter for the private field "price", it's a setter that
     * updates value of "price".
     *
     * @param price - Uses the price parameter to set the price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of Product.
     *
     * @return - It returns the properties of Product.
     */
    @Override
    public String toString() {
        return "Product Name: " + name + ", Prodcut ID: " + productId + ", Price: $" + price;

    }

    /**
     * This is a stub method, to return how long a product has been in store.
     */
    public void productAge() {

    }

}
