/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the class DVD a subclass of Product with it's own unique set of identifiers.
 *
 * @author Alexander Tekleab
 */
public class DVD extends Product {

    // creating private fields
    private String movieTitle;
    private String directorName;
    private String productionCompany;

    /**
     * This is a CD constructor with it's passed in value, String, int, double,
     * String, String, String.
     *
     * @param name - This parameter is setting DVD's name, String.
     * @param productId - This parameter is setting DVD's Product ID, int.
     * @param price - This parameter is setting DVD's Product price, double.
     * @param movieTitle - This parameter is setting DVD's Movie title, String.
     * @param directorName - This parameter is setting DVD's Director's name,
     * String.
     * @param productionCompany - This parameter is setting DVD's Production
     * Company, String.
     */
    public DVD(String name, int productId, double price, String movieTitle, String directorName, String productionCompany) {
        super(name, productId, price);
        this.movieTitle = movieTitle;
        this.directorName = directorName;
        this.productionCompany = productionCompany;
    }

    // getters
    /**
     * This is a getter for the private field "movieTitle", its a getter that
     * reads the value of "movieTitle".
     *
     * @return - It returns the Movie title.
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * This is a getter for the private field "directorName", its a getter that
     * reads the value of "diretorName".
     *
     * @return - It returns the Director name.
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * This is a getter for the private field "productionCompany", its a getter
     * that reads the value of "productionCompany".
     *
     * @return - It returns the Production Company.
     */
    public String getProductionCompany() {
        return productionCompany;
    }

    /**
     * This is a setter for the private field "movieTitle", it's a setter that
     * updates value of "movieTitle".
     *
     * @param movieTitle - Uses the movieTitle parameter to set the Movie title.
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    /**
     * This is a setter for the private field "directorName", it's a setter that
     * updates value of "directorName".
     *
     * @param directorName - Uses the directorName parameter to set the Director
     * name.
     */
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    /**
     * This is a setter for the private field "productionCompany", it's a setter
     * that updates value of "productionCompany".
     *
     * @param productionCompany - Uses the productionCompany parameter to set
     * the Production Company.
     */
    public void setproductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of DVD.
     *
     * @return - It returns the properties of DVD.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += ", Movie title: " + movieTitle + ", Director name: " + directorName
                + ", Production company: " + productionCompany;
        return result;

    }

    /**
     * This is a stub method to to tell how long a DVD is.
     *
     * @return - It returns the DVD length, String type.
     */
    public String dvdDuration() {
        return null;

    }

}
