package GoFo;

/**
 * @auther Mostafa El Gendy class player
 */
import java.util.Scanner;

public class Player {

    private String Name;
    private String phoneNumber;
    private String Email;
    private String Password;
    private int id;
    private String[] friends = new String[10];
    private int counter = 0;         /////counter of array friends
    public static int count = 0;
    private double balance;

    /**
     * constructor that increment the counter and assign counter on id
     */
    public Player() {
        count++;
        id = count;
    }

    /**
     *
     * @param n name of the player
     * @param pn phone number of player
     * @param em email of player
     * @param pass passward of player
     */
    public Player(String n, String pn, String em, String pass) {
        count++;
        id = count;
        this.Name = n;
        this.phoneNumber = pn;
        this.Email = em;
        this.Password = pass;
    }

    /**
     * function that display the information about players
     *
     * @param all display all information about the player
     * @see playrounds
     */
    public void displayPlaygrounds(Playgrounds all) {
        all.DisplayAll();
    }

    /**
     * function that filter the playgrounds
     *
     * @param s
     * @param e
     * @param all
     * @see playrounds
     */
    public void filterplayground(int s, int e, Playgrounds all) {
        all.Getfilt(s, e);

    }

    /**
     * function that add friends
     *
     * @param friend name of friend
     */
    public void addFriends(String friend) {
        if (counter == 10) {
            System.out.println("list of friends is full");
        } else {
            friends[counter] = friend;
            counter++;
        }
    }

    /**
     * get name of player
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name set the name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * get phone number
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber set phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * get email
     *
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * set email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.Email = email;
    }

    /**
     * get password
     *
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * set password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.Password = password;
    }

    /**
     * get balance
     *
     * @return balance
     */
    public double getbalance() {
        return balance;
    }

    /**
     * set balance
     *
     * @param b
     */
    public void setbalance(double b) {
        this.balance = b;
    }

    /**
     * function that allow player to book playground after filter the
     * playgrounds
     *
     * @param all
     * @see playrounds
     */
    public void Booking(Playgrounds all) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Start time: ");
        int start = in.nextInt();
        System.out.print("Enter end time: ");
        int end = in.nextInt();
        all.Getfilt(start, end);
        System.out.println("Do You Want to Book any of These Playgrounds?");
        System.out.println("1- Yes");
        System.out.println("2- No");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print("Enter the name of Playground You want to book: ");
            String z = in.next();
            Playground x = new Playground();
            all.search(z);
            x = all.search(z);
            System.out.println("How many hours do you want to book? ");
            int r = in.nextInt();
            if (balance > r * x.getPriceperhour()) {
                balance -= x.getPriceperhour() * r;
                x.setAvailableduringbooking(start, end);
            } else {
                System.out.println("Unable to Book, You Don't have enough money ");
            }
        } else if (choice == 2) {
            return;
        }
    }
}
