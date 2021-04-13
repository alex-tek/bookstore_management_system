/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the class Book a subclass of Product with it's own unique set of identifiers.
 *
 * @author Alexander Tekleab
 */
public class Book extends Product {

    // creating private fields
    private String isbn;

    /**
     * This is a Book constructor with it's passed in value, String, int,
     * double, String.
     *
     * @param name - This parameter is setting Book's name, String.
     * @param productId - This parameter is setting Book's Product ID, int.
     * @param price - This parameter is setting Book's Product price, double.
     * @param isbn - This parameter is setting Book's Product ISBN, double.
     */
    public Book(String name, int productId, double price, String isbn) {
        super(name, productId, price);
        this.isbn = isbn;
    }

    /**
     * This is a getter for the private field "isbn", its a getter that reads
     * the value of "isbn".
     *
     * @return - It returns the ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This is a setter for the private field "isbn", it's a setter that updates
     * value of "isbn".
     *
     * @param isbn - Uses the isbn parameter to set ISBN.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of Book.
     *
     * @return - It returns the properties of Book.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += ", ISBN: " + isbn;
        return result;

    }

    /**
     * This a stub method to return the amount of pages in a book
     *
     * @return - It return the amount of pages, int type.
     */
    public int bookPageAmount() {
        return 0;

    }

}
