
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This is the main class Start it will run my 5 major functions here and below
 * I will describe them.
 *
 * @author Alexander Tekleab
 */
public class Start {

    /**
     * The main where everything runs.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Below are my 5 major functions, I will describe what each one does|
         * addMember() - This is the method addMember, this method gives you the
         * option of adding two type of member, The first option is to add a
         * Premium Member while the other option is to add a free Member
         * addStock() - This is the addStock method, this method gives you the
         * option to stock the inventory, you can stock Books, CDs, or DVDs
         * buyProduct() - This is the buyProduct method, in this method you can
         * buy 3 type of product, Books, CDs, DVDs findProduct() - This is the
         * findProduct method, in this method by entering a product ID it will
         * look through the store inventory and find the product findMember() -
         * This is the findMember method, it looks through the stores members
         * based on the input of member ID and when it finds it it prints the
         * members information Those are my 5 major functions and their
         * functionality.
         */
        boolean done = false;
        while (!done) {
            try {
                Bookstore store = new Bookstore("Bookstore");

                store.displayMenu();

                Scanner input = new Scanner(System.in);

                System.out.print("Please select a number of your choice between 0-5.\n"
                        + "Enter your choice of number = ");
                int choice = input.nextInt();
                switch (choice) {

                    case 1:
                        store.addMember();

                        break;

                    case 2:
                        store.addStock();

                        break;

                    case 3:
                        store.buyProduct();
                        break;

                    case 4:
                        store.findProduct();
                        break;
                    case 5:
                        store.findMember();
                        break;
                    case 0:
                        done = true;
                        System.out.println("\nThank you for visiting our Bookstore! Have a good day!");

                }

            } catch (Exception e) {
                System.out.println("\nInvalid Input: You didn't enter an Integer between 0-5.\n"
                        + "Which means Program will restart from the beginning!!! ");

            }
        }

    }

}
