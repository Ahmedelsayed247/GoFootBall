package GoFo;

/**
 * @auter Ahmed ElSayed
 */
import java.util.ArrayList;

public class PlaygroundOwner {

    private String Name;
    private String Phone;
    private String Email;
    private String Password;
    private ArrayList<Playground> OwnerPlaygrounds;

    /**
     * constructor that assign name , phone , email , password top to
     * playgroundOwner
     *
     * @param Name
     * @param Phone
     * @param Email
     * @param Password
     */
    public PlaygroundOwner(String Name, String Phone, String Email, String Password) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
        OwnerPlaygrounds = new ArrayList<Playground>();
    }

    /**
     * get name
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * set name
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * get phone
     *
     * @return Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * set phone
     *
     * @param Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
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
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * function that allow playground owner to add his playground
     *
     * @param n playground name
     * @param size playground size
     * @param price price pre hour
     * @param obj
     */
    public void addPlayground(String n, int size, double price, Playgrounds obj) {
        Playground temp = new Playground(n, size, price);
        temp.setAvailableTime();
        this.OwnerPlaygrounds.add(temp);
        obj.add_playground(temp);
    }

    /**
     * function that display the play ground infromation
     */
    public void DisplayOwnerPlayground() {
        for (int i = 0; i < OwnerPlaygrounds.size(); ++i) {
            System.out.println(OwnerPlaygrounds.get(i));
        }
    }
}
