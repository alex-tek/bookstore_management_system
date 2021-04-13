
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This is the Bookstore class, this class handles all of the store logistics /
 * methods.
 *
 * @author Alexander Tekleab
 */
public class Bookstore {

    // creating private fields
    private String name;
    private ArrayList<Product> stock = new ArrayList<Product>();
    private ArrayList<Member> memberList = new ArrayList<Member>();

    /**
     * This is a Bookstore constructor with it's passed in value, String.
     *
     * @param name - This parameter is setting the Bookstore's name, String.
     */
    public Bookstore(String name) {
        this.name = name;
    }

    /**
     * This is a getter for the private field "firstName", its a getter that
     * reads the value of "firstName".
     *
     * @return - It returns String name.
     */
    public String getName() {
        return name;
    }

    /**
     * This is a getter for the private ArrayList "stock", its a getter that
     * reads the value of the ArrayList "stock".
     *
     * @return - It returns what's in the ArrayList stock.
     */
    public ArrayList<Product> getStock() {
        return stock;
    }

    /**
     * This is a getter for the private ArrayList "memberList", its a getter
     * that reads the value of the ArrayList "memberList".
     *
     * @return - It returns what's in the ArrayList memberList.
     */
    public ArrayList<Member> getMemberList() {
        return memberList;
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
     * This is the displayMenu method it display the basic functionality of this
     * Bookstore, and the actions available.
     */
    public void displayMenu() {
        System.out.println("\nThank you for visiting our Bookstore, please look at our menu below,\n"
                + "and let me know how I can assist you.\n"
                + "\n***********************\n"
                + "         MENU          \n"
                + "***********************"
                + "\n[1]. Add Member.\n"
                + "[2]. Add Stock.\n"
                + "[3]. Buy Product.\n"
                + "[4]. Find Product.\n"
                + "[5]. Find Member.\n"
                + "[0]. Exit Bookstore.\n"
                + "***********************\n");
    }

    /**
     * This is the method addMember, this method gives you the option of adding
     * two type of member, The first option is to add a Premium Member while the
     * other option is to add a free Member.
     */
    public void addMember() {
        boolean done = false;
        while (!done) {
            try {
                System.out.print("\nThank you for choosing to add a member.\n"
                        + "We offer 2 type of memberships, please select 1 or 2 for your choice.\n"
                        + "[1] = Premium Membership\n"
                        + "[2] = Free Membership\n"
                        + "\nEnter your choice of number = ");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                while (choice < 1 || choice > 2) {
                    System.out.print("\nError! You must select a number between 1-2.\n"
                            + "\nWe offer 2 type of memberships, please select 1 or 2 for your choice.\n"
                            + "[1] = Premium Membership\n"
                            + "[2] = Free Membership\n"
                            + "\nEnter your choice of number = ");

                    choice = input.nextInt();
                }
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("\nThank you for choosing to add a Premium Member.\n"
                                + "I'm just going to need some information from you to process this.\n"
                                + "\nWhat's your first name?\n"
                                + "First name: ");
                        String firstName = input.nextLine();
                        System.out.print("\nWhat's your last name?\n"
                                + "Last name: ");
                        String lastName = input.nextLine();
                        Random random = new Random();
                        int idNum = (random.nextInt(9) + 1);
                        System.out.print("\nWe will generate a random Customer ID for you.\n"
                                + "ID number: " + idNum + "\n");
                        System.out.print("\nWhat's your balance?\n"
                                + "Balance: ");
                        double balance = input.nextDouble();
                        System.out.println("\nThnak you for that, and we will be using your balance\n"
                                + "to complete today's transaction.");
                        String paymentMethod = "Balance";
                        PremiumMember member = new PremiumMember(firstName, lastName, idNum, balance, paymentMethod);
                        if (member.getBalance() < member.getMonthlyFee()) {
                            System.out.println("\nYou do not have enough in your balance to become a Premium Member " + member.getFirstName() + "!!\n"
                                    + "Come back again when you have enough, Thank you!");
                            break;
                        }
                        member.setBalance(member.getBalance() - member.getMonthlyFee());
                        memberList.add(member);
                        System.out.println("\nYou are all set. I have deducted a fee of $10 for becoming a Premium Member,\n"
                                + "Thank you for choosing to shop with us " + member.getFirstName() + "!\n"
                                + "I will attach a receipt of all the information covered today, have a good day!\n");
                        System.out.println(member.toString());
                        member.setFeePaidOnTime(true);

                        break;

                    case 2:
                        System.out.print("\nThank you for choosing to add a Member.\n"
                                + "I'm just going to need some information from you to process this.\n"
                                + "\nWhat's your first name?\n"
                                + "First name: ");
                        String fName = input.nextLine();
                        System.out.print("\nWhat's your last name?\n"
                                + "Last name: ");
                        String lName = input.nextLine();
                        Random r = new Random();
                        int idNumber = (r.nextInt(9) + 1);
                        System.out.print("\nWe will generate a random Customer ID for you.\n"
                                + "ID number: " + idNumber + "\n");
                        System.out.print("\nWhat's your balance?\n"
                                + "Balance: ");
                        double customerBalance = input.nextDouble();
                        System.out.println("\nThnak you for that.");
                        Member freeMember = new Member(fName, lName, idNumber, customerBalance);
                        memberList.add(freeMember);
                        System.out.println("You are all set. Thank you for choosing to shop with us " + freeMember.getFirstName() + "!\n"
                                + "I will attach a receipt of all the information covered today, have a good day!\n");
                        System.out.println(freeMember.toString());

                        break;

                }
                done = true;
            } catch (Exception e) {
                System.out.println("\nInvalid Input! Try again!");
            }
        }
    }

    /**
     * This is the addStock method, this method gives you the option to stock
     * the inventory, you can stock Books, CDs, or DVDs.
     */
    public void addStock() {
        boolean done = false;
        while (!done) {
            try {
                System.out.print("\nThank you for choosing to add to stock.\n"
                        + "We offer 3 type of products, please select 1-3 to begin stocking merchandise.\n"
                        + "[1] = Add Book\n"
                        + "[2] = Add CD\n"
                        + "[3] = Add DVD\n"
                        + "\nEnter your choice of number = ");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                while (choice < 1 || choice > 3) {
                    System.out.print("\nError! You must select a number between 1-3.\n"
                            + "We offer 3 type of products, please select 1-3 to begin stocking merchandise.\n"
                            + "[1] = Add Book\n"
                            + "[2] = Add CD\n"
                            + "[3] = Add DVD\n"
                            + "\nEnter your choice of number = ");

                }
                input.nextLine();

                switch (choice) {

                    // switching to case 1, allows option to add Books
                    case 1:
                        System.out.print("\nThank you for choosing to add a book to the stock.\n"
                                + "I'm just going to need some information from you to process this.\n"
                                + "\nWhat's the book name?\n"
                                + "Book name: ");
                        String bookName = input.nextLine();
                        Random random = new Random();
                        int prodId = (random.nextInt(9) + 1);
                        System.out.print("\nWe will generate a random Product ID for you.\n"
                                + "Product ID: " + prodId + "\n"
                                + "\nWhat's the price of the Book?\n"
                                + "Book Price: ");
                        double bookPrice = input.nextDouble();
                        input.nextLine();
                        System.out.print("\nWhat's the International Standard Book Number?\n"
                                + "Book ISBN: ");
                        String bookIsbn = input.nextLine();
                        Book book = new Book(bookName, prodId, bookPrice, bookIsbn);
                        stock.add(book);
                        System.out.println("\nYou are all set. Thank you for stocking " + book.getName() + " to our inventory!\n"
                                + "I will attach a receipt of the Book stocked today, have a good day!\n");
                        System.out.println(book.toString());

                        break;

                    // switching to case 2, allows option to add CDs
                    case 2:
                        System.out.print("\nThank you for choosing to add a CD to the stock.\n"
                                + "I'm just going to need some information from you to process this.\n"
                                + "\nWhat's the CD name?\n"
                                + "CD name: ");
                        String cdName = input.nextLine();
                        Random r = new Random();
                        int pId = (r.nextInt(9) + 1);
                        System.out.print("\nWe will generate a random Product ID for you.\n"
                                + "Product ID: " + pId + "\n"
                                + "\nWhat's the price of the CD?\n"
                                + "CD Price: ");
                        double cdPrice = input.nextDouble();
                        input.nextLine();
                        System.out.print("\nWhat's the Album name?\n"
                                + "Album name: ");
                        String albumName = input.nextLine();
                        System.out.print("\nWhat's the Artist name?\n"
                                + "Artist name: ");
                        String artistName = input.nextLine();
                        CD cd = new CD(cdName, pId, cdPrice, albumName, artistName);
                        stock.add(cd);
                        System.out.println("\nYou are all set. Thank you for stocking " + cd.getName() + " to our inventory!\n"
                                + "I will attach a receipt of the CD stocked today, have a good day!\n");
                        System.out.println(cd.toString());
                        break;

                    // switching to case 3, allows option to add DVDs
                    case 3:
                        System.out.print("\nThank you for choosing to add a DVD to the stock.\n"
                                + "I'm just going to need some information from you to process this.\n"
                                + "\nWhat's the DVD name?\n"
                                + "DVD name: ");
                        String dvdName = input.nextLine();
                        Random rand = new Random();
                        int productId = (rand.nextInt(9) + 1);
                        System.out.print("\nWe will generate a random Product ID for you.\n"
                                + "Product ID: " + productId + "\n"
                                + "\nWhat's the price of the DVD?\n"
                                + "DVD Price: ");
                        double dvdPrice = input.nextDouble();
                        input.nextLine();
                        System.out.print("\nWhat's the DVD Movie title?\n"
                                + "Movie title: ");
                        String movieTitle = input.nextLine();
                        System.out.print("\nWhat's the DVD Director name?\n"
                                + "Director name: ");
                        String directorName = input.nextLine();
                        System.out.print("\nWhat's the DVD Production Company name?\n"
                                + "Production Company name: ");
                        String productionCompany = input.nextLine();
                        DVD dvd = new DVD(dvdName, productId, dvdPrice, movieTitle, directorName, productionCompany);
                        stock.add(dvd);
                        System.out.println("\nYou are all set. Thank you for stocking " + dvd.getName() + " to our inventory!\n"
                                + "I will attach a receipt of the DVD stocked today, have a good day!\n");
                        System.out.println(dvd.toString());

                        break;

                }
                done = true;
            } catch (Exception e) {
                System.out.println("\nInvalid Input! Try again!");
            }
        }

    }

    /**
     * This is the buyProduct method, in this method you can buy 3 type of
     * product, Books, CDs, DVDs.
     */
    public void buyProduct() {
        boolean done = false;
        while (!done) {
            try {
                System.out.print("\nThank you for choosing to buy a product.\n"
                        + "We offer 3 type of products, please select 1-3 to purchase a product you'd like.\n"
                        + "[1] = Buy Book\n"
                        + "[2] = Buy CD\n"
                        + "[3] = Buy DVD\n"
                        + "\nEnter your choice of number = ");

                // adding to product to arrayLsit
                Book book1 = new Book("Stoner", 1, 5.0, "978-3-16-148410-0");
                stock.add(book1);
                Book book2 = new Book("Shogun", 2, 5.0, "939-3-17-149410-0");
                stock.add(book2);
                Book book3 = new Book("Children of Time", 3, 5.0, "978-3-16-148410-0");
                stock.add(book3);
                CD cd1 = new CD("Rap Album", 4, 10.0, "Forest Hills Drive", "J. Cole");
                stock.add(cd1);
                CD cd2 = new CD("Rap Album", 5, 10.0, "4 Your Eyez Only", "J. Cole");
                stock.add(cd2);
                CD cd3 = new CD("Rap Album", 6, 10.0, "Die Lit", "Playboi Carti");
                stock.add(cd3);
                DVD dvd1 = new DVD("Blu-ray Disc", 7, 10.0, "Holes", "Andrew Davis", "Walt Disney Pictures");
                stock.add(dvd1);
                DVD dvd2 = new DVD("Blu-ray Disc", 8, 10.0, "Joker", "Todd Phillips", "Warner Bros");
                stock.add(dvd2);
                DVD dvd3 = new DVD("Blu-ray Disc", 9, 10.0, "Infinity War", "Anthony Russo", "Marvel Studios");
                stock.add(dvd3);

                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                while (choice < 1 || choice > 3) {
                    System.out.print("\nError! You must select a number between 1-3.\n"
                            + "We offer 3 type of products, please select 1-3 to purchase a product you'd like.\n"
                            + "[1] = Buy Book\n"
                            + "[2] = Buy CD\n"
                            + "[3] = Buy DVD\n"
                            + "\nEnter your choice of number = ");

                }

                input.nextLine();

                switch (choice) {

                    // switching to case 1, allows option to purchase Books
                    case 1:
                        int bookId = 0;
                        System.out.print("\nThank you for choosing to buy a Book. Look at the Book menu below."
                                + "\nYou must enter a number choice between 1-3 for the Book ID to purchase a book.\n"
                                + "\n***********************\n"
                                + "       BOOK MENU       \n"
                                + "***********************"
                                + "\n[1]. Stoner\n"
                                + "[2]. Shogun\n"
                                + "[3]. Children of Time\n"
                                + "***********************\n"
                                + "\nWhat's the Book ID?\n"
                                + "Book ID: ");
                        bookId = input.nextInt();
                        while (bookId < 1 || bookId > 3) {
                            System.out.println("\nError! Your Book ID must be between 1-3. Try again!");
                            System.out.print("Book ID: ");
                            bookId = input.nextInt();
                        }
                        for (Product p : stock) {
                            if (p.getProductId() == bookId) {
                                System.out.println("\nThank you for deciding to buy " + p.getName() + ".\n"
                                        + "I will print the receipt below. I have also deducted $5.0 from your balance.\n");
                                System.out.println(p.toString());
                                System.out.println("\nThank you for shopping with us, and have a good day.");
                                for (Member m : memberList) {
                                    m.setBalance(m.getBalance() - p.getPrice());
                                }
                            }
                        }

                        break;

                    // switching to case 2, allows option to purchase CDs
                    case 2:
                        int cdId = 0;
                        System.out.print("\nThank you for choosing to buy a CD. Look at the CD menu below."
                                + "\nYou must enter a number choice between 3-6 for the CD ID to purchase a CD.\n"
                                + "\n***********************\n"
                                + "       CD MENU         \n"
                                + "***********************"
                                + "\n[4]. Forest Hills Drive\n"
                                + "[5]. 4 Your Eyez Only\n"
                                + "[6]. Die Lit\n"
                                + "***********************\n"
                                + "\nWhat's the CD ID?\n"
                                + "CD ID: ");
                        cdId = input.nextInt();
                        while (cdId < 4 || cdId > 6) {
                            System.out.println("\nError! Your CD ID must be between 4-6. Try again!");
                            System.out.print("CD ID: ");
                            cdId = input.nextInt();
                        }
                        for (Product p : stock) {
                            if (p.getProductId() == cdId) {
                                System.out.println("\nThank you for deciding to buy a " + p.getName() + ".\n"
                                        + "I will print the receipt below. I have also deducted $10.0 from your balance.\n");
                                System.out.println(p.toString());
                                System.out.println("\nThank you for shopping with us, and have a good day.");
                                for (Member m : memberList) {
                                    m.setBalance(m.getBalance() - p.getPrice());
                                }
                            }
                        }

                        break;

                    // switching to case 3, allows option to purchase DVDs
                    case 3:

                        int dvdId = 0;
                        System.out.print("\nThank you for choosing to buy a DVD. Look at the DVD menu below."
                                + "\nYou must enter a number choice between 7-9 for the DVD ID to purchase a DVD.\n"
                                + "\n***********************\n"
                                + "       DVD MENU        \n"
                                + "***********************"
                                + "\n[7]. Holes\n"
                                + "[8]. Joker\n"
                                + "[9]. Infinity War\n"
                                + "***********************\n"
                                + "\nWhat's the DVD ID?\n"
                                + "DVD ID: ");
                        dvdId = input.nextInt();
                        while (dvdId < 7 || dvdId > 9) {
                            System.out.println("\nError! Your DVD ID must be between 7-9. Try again!");
                            System.out.print("DVD ID: ");
                            dvdId = input.nextInt();
                        }
                        for (Product p : stock) {
                            if (p.getProductId() == dvdId) {
                                System.out.println("\nThank you for deciding to buy a " + p.getName() + ".\n"
                                        + "I will print the receipt below. I have also deducted $10.0 from your balance.\n");
                                System.out.println(p.toString());
                                System.out.println("\nThank you for shopping with us, and have a good day.");
                                for (Member m : memberList) {
                                    m.setBalance(m.getBalance() - p.getPrice());
                                }
                            }
                        }

                        break;

                }
                done = true;
            } catch (Exception e) {
                System.out.println("\nInvalid Input! Try again!");
            }
        }

    }

    /**
     * This is the findProduct method, in this method by entering a product ID
     * it will look through the store inventory and find the product.
     */
    public void findProduct() {
        boolean done = false;
        while (!done) {
            try {
                // creating scanner and variable
                int dvdId;
                Scanner input = new Scanner(System.in);
                System.out.print("\nThank you for choosing Find Product.\n"
                        + "We will be trying to locate some of our DVD products.\n"
                        + "\nEnter a DVD ID between 1-3.\n"
                        + "DVD ID: ");

                dvdId = input.nextInt();

                // adding products
                DVD dvd1 = new DVD("Blu-ray Disc", 1, 10.0, "Holes", "Andrew Davis", "Walt Disney Pictures");
                stock.add(dvd1);
                DVD dvd2 = new DVD("Blu-ray Disc", 2, 10.0, "Joker", "Todd Phillips", "Warner Bros");
                stock.add(dvd2);
                DVD dvd3 = new DVD("Blu-ray Disc", 3, 10.0, "Infinity War", "Anthony Russo", "Marvel Studios");
                stock.add(dvd3);

                // restriction product ID input
                while (dvdId < 1 || dvdId > 3) {
                    System.out.print("\nError! Your DVD ID must be between 1-3. Try again!\n");
                    System.out.print("DVD ID: ");
                    dvdId = input.nextInt();
                }

                // looping through memberList ArrayList and printing member information
                for (Product p : stock) {
                    if (p.getProductId() == dvdId) {
                        System.out.println("\n" + p.toString()
                                + "\n\nYou have located the DVD Movie " + (((DVD) p).getMovieTitle()) + ", greate job!");
                    }

                }
                done = true;
            } catch (Exception e) {
                System.out.println("\nInvalid Input! Try again!");
            }
        }
    }

    /**
     * This is the findMember method, it looks through the stores members based
     * on the input of member ID and when it finds it it prints the members
     * information.
     */
    public void findMember() {
        boolean done = false;
        while (!done) {
            try {
                // creating scanner and variable
                int memberId;
                Scanner input = new Scanner(System.in);
                System.out.print("\nThank you for choosing Find Member.\n"
                        + "We will be trying to locate some of our Premium Member.\n"
                        + "\nEnter a Member ID between 1-3.\n"
                        + "Member ID: ");

                memberId = input.nextInt();

                // adding members
                PremiumMember member1 = new PremiumMember("Alexander", "Wang", 1, 100.0, "Balance");
                memberList.add(member1);
                PremiumMember member2 = new PremiumMember("Xander", "Mcqueen", 2, 100.0, "Balance");
                memberList.add(member2);
                PremiumMember member3 = new PremiumMember("Axle", "Givenchy", 3, 100.0, "Balance");
                memberList.add(member3);

                // restricting member ID input
                while (memberId < 1 || memberId > 3) {
                    System.out.print("\nError! Your Member ID must be between 1-3. Try again!\n");
                    System.out.print("Member ID: ");
                    memberId = input.nextInt();
                }

                // looping through memberList ArrayList and printing member information
                for (Member m : memberList) {
                    if (m.getMemberId() == memberId) {
                        System.out.println("\n" + m.toString()
                                + "\n\nYou have located " + m.getFirstName() + " the Premium Member, greate job!");
                    }

                }
                done = true;
            } catch (Exception e) {
                System.out.println("\nInvalid Input! Try again!");
            }
        }

    }

    /**
     * This is a stub method, essentially what I want it to do is, loop through
     * the memberList ArrayList, and find all the PremiumMembers and based on
     * the input parameter id find the lucky winner and give him a product from
     * the stock ArrayList for free.
     *
     * @param id - uses id to see if it matches any of Premium Members ID.
     */
    public void weeklyGiveaway(int id) {

    }

    /**
     * This is a stub method, in this method I want to be able to find the
     * Premium Member, who have not been paying their monthly fee on time and
     * essentially warn for the first time, but if they are late again I want to
     * take their membership away, basically removing them from the ArrayList.
     *
     * @param id - uses id to see if it matches any of Premium Members ID.
     */
    public void banPremiumMember(int id) {

    }

    /**
     * This is a stub method, similar to the weeklyGiveaway, here I want to
     * promote and regular member who's constantly spending money at the
     * bookstore to Premium Member for free.
     *
     * @param id - uses id to see if it matches and of the free loyal Members
     * ID.
     */
    public void loyalMember(int id) {

    }

    /**
     * This is another stub method, I basically want to prevent purchasing or
     * even adding members after certain hours stating the bookstore is closed
     * or not operating at those time.
     */
    public void storeHours() {

    }

    /**
     * This is another stub method, if a product is on stock for a while and it
     * doesn't get sold and it becomes old / damaged I wanna take it down and
     * replace it with a new product, I would basically need a way to keep track
     * of how long a product is in stock and then remove it from ArrayList and
     * then add the new product to the ArrayList.
     *
     * @param id - Uses id to matches the product ID.
     */
    public void replaceProduct(int id) {

    }

}
