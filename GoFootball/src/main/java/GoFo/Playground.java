package GoFo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author youssef ayoub
 */
public class Playground {

    protected String name;
    protected int size;
    protected double priceperhour;
    protected boolean[] availableTime = new boolean[24];

    /**
     * constructor that assign name , size , price per hour about the playground
     *
     * @param name
     * @param size
     * @param priceperhour
     */
    public Playground(String name, int size, double priceperhour) {
        this.name = name;
        this.size = size;
        this.priceperhour = priceperhour;
    }

    /**
     * default constructor for playground class
     */
    public Playground() {
    }

    /**
     * get name of the playground
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ser the name of the playground
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get size of the playground
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * set the size of playground
     *
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * get the price per hour
     *
     * @return priceperhour
     */
    public double getPriceperhour() {
        return priceperhour;
    }

    /**
     * set the price per hour of the playground
     *
     * @param priceperhour
     */
    public void setPriceperhour(int priceperhour) {
        this.priceperhour = priceperhour;
    }

    /**
     * this funvtion make to see the available time to booking in it
     *
     * @return output
     */
    public String getAvailableTime() {
        String output = "";
        for (int i = 0; i < 24; ++i) {
            if (availableTime[i] == true) {
                output += i;
                break;
            }
        }
        output += " to ";
        for (int i = 23; i >= 0; --i) {
            if (availableTime[i] == true) {
                output += i;
                break;
            }
        }
        return output;
    }

    /**
     * this function set the available time for booking
     */
    public void setAvailableTime() {
        System.out.println("What is the free time for the playground");
        System.out.println("From:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("To: ");
        int y = input.nextInt();
        for (int i = x; i <= y; ++i) {
            availableTime[i] = true;
        }
    }

    /**
     * this function set the time that your are allowed to book on it
     *
     * @param s
     * @param e
     */
    public void setAvailableduringbooking(int s, int e) {
        for (int i = s; i < e; ++i) {
            availableTime[i] = false;
        }

    }

    public void resetAvailableduringbooking(int s, int e) {
        for (int i = s; i < e; ++i) {
            availableTime[i] = true;
        }

    }

    /**
     * @see object class to override to string method
     * @return information about the playground
     */
    @Override
    public String toString() {
        return "Playground{" + "name=" + name + ", size=" + size + ", priceperhour=" + priceperhour + ", availableTime=" + this.getAvailableTime() + '}';
    }

}
