/**
 * This is the superclass Media, made abstract so as to not have its own objects
 * but only those of its subclasses. It stores information
 * about the book and CD classes
 *
 * @author Olivia Fabreschi
 * @Version Sep 2023
 */
public abstract class Media {
    private String title;
    private int yearOfRelease;
    UserInput input = new UserInput();

    /**
     *  the constructor covers all items that relate to all subclasses
     */

    public Media(){
        printWelcome();
        setTitle();
        setYear();
    }

    /**
     * This method sets the title by calling the scanner object in the UserInput class
     */
    public void setTitle(){
        System.out.print("Enter title: ");
        input.setInputString();
        this.title = input.getUserInputString();
    }
    /**
     * This method sets the year by calling the scanner object in the UserInput class
     */
    public void setYear(){
        System.out.print("Enter year of creation: ");
        input.setInputYear();
        this.yearOfRelease = input.getUserInputInt();
    }

    /**
     * This method shows the info on the title and year of release
     */
    public void showInfo(){
        System.out.println("Title is: " + this.title);
        System.out.println("Year of release is: " + this.yearOfRelease);
    }

    /**
     * this prints a welcome message, mainly so that it can be overwritten in the
     * subclasses but shown before any of the constructor input is called from this super class,
     * so that the overwritten message is shown first
     */
    public void printWelcome(){
        System.out.println("Welcome!");
    }
}
