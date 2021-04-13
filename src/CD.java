/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the class CD a subclass of Product with it's own unique set of identifiers.
 *
 * @author Alexander Tekleab
 */
public class CD extends Product {

    // creating private fields
    private String albumName;
    private String artistName;

    /**
     * This is a CD constructor with it's passed in value, String, int, double,
     * String, String.
     *
     * @param name - This parameter is setting CD's name, String.
     * @param productId - This parameter is setting CD's Product ID, int.
     * @param price - This parameter is setting CD Product price, double.
     * @param albumName - This parameter is setting CD's Album name, String.
     * @param artistName - This parameter is setting CD's Artist name, String.
     */
    public CD(String name, int productId, double price, String albumName, String artistName) {
        super(name, productId, price);
        this.albumName = albumName;
        this.artistName = artistName;
    }

    /**
     * This is a getter for the private field "albumName", its a getter that
     * reads the value of "albumName".
     *
     * @return - It returns the Album name.
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * This is a getter for the private field "artistName", its a getter that
     * reads the value of "artistName".
     *
     * @return - It returns the Artist name.
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * This is a setter for the private field "albumName", it's a setter that
     * updates value of "albumName".
     *
     * @param albumName - Uses the albumName parameter to set the Album name.
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * This is a setter for the private field "artistName", it's a setter that
     * updates value of "artistName".
     *
     * @param artistName - Uses the artistName parameter to set the Artist name.
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * This is a toString method that overrides the already written toString
     * method to print the properties of CD.
     *
     * @return - It returns the properties of CD.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += ", Album name: " + albumName + ", Artist name: " + artistName;
        return result;

    }

    /**
     * This is a stub method to see all the song list in a CD.
     */
    public void songList() {

    }

}
