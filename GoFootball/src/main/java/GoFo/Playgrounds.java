package GoFo;

/**
 * @auther youssef Khalid
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Playgrounds {

    private ArrayList<Playground> playgrounds;

    /**
     * constructor that set array list of playgrounds
     */
    public Playgrounds() {
        this.playgrounds = new ArrayList<Playground>();
    }

    /**
     *
     * @param obj add play ground
     * @see playground to get add function
     */
    public void add_playground(Playground obj) {
        playgrounds.add(obj);
    }

    /**
     * display array list of playgrounds
     */
    public void DisplayAll() {
        System.out.println(playgrounds);
    }

    /**
     * make you to search for the playground
     *
     * @param n
     * @param obj
     */
    public void seach(String n, Playground obj) {
        int size = playgrounds.size();
        for (int i = 0; i < size; ++i) {
            if (playgrounds.get(i).name == n) {
                obj = playgrounds.get(i);

            }
        }

    }

    /**
     * make you to search for your team
     * @param n
     * @return playground
     * @see playground
     */
    public Playground search(String n) {
        Scanner in = new Scanner(System.in);
        int size = playgrounds.size();
        int x, defaul = 0;
        for (int i = 0; i < size; ++i) {
            if (playgrounds.get(i).name == n) {
                x = i;
                return playgrounds.get(x);
            }
        }
        System.out.println("This Name isn't found, We will get you default'First One'");
        System.out.println("Do You Want to Enter name again? or accept the Default");
        System.out.println("1- Accept the Default 2- Search again");
        int choice = in.nextInt();
        if (choice == 1) {
            return playgrounds.get(defaul);
        } else {
            System.out.print("Enter the name again: ");
            String s = in.next();
            return search(s);
        }
    }

    /**
     * function that filter the playgrounds
     *
     * @param s
     * @param e
     */
    public void Getfilt(int s, int e) {
        int size = playgrounds.size();
        for (int i = 0; i < size; ++i) {
            for (int j = s; j <= e; ++i) {
                if (playgrounds.get(i).availableTime[j] == true) {
                    System.out.println("This Period is free");
                    playgrounds.get(i).toString();
                } else {
                    System.out.print("This Period isn't free...");
                    return;
                }

            }
        }

    }

}
