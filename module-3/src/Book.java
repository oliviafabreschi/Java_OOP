/**
 * This is a subclass of Media, which stores information about books
 *
 *
 * @author Olivia Fabreschi
 * @Version Sep 2023
 */
public class Book extends Media {

    private String author;
    private int isbnNumber;

    UserInput input = new UserInput();

    public Book(){

        setAuthor();
        //commenting out old information that is now covered by the superclass
            //System.out.println("Enter info for book: ");
            //setTitle();
            //setYear();
        setIsbnNumber();

    }

    /**
     * This method shows a message to the user before input is gathered
     * it overrides the one set by the super class
     * in order to be shown first before any input is collected
     */
    @Override
    public void printWelcome(){
        super.printWelcome();
        System.out.println("Enter input for book. ");
    }

//these methods are now covered by the superclass
        /*public void setTitle(){
            System.out.println("Enter title name: ");
            input.setInputString();
            this.title = input.getUserInputString();
        }

        public void setYear(){
            System.out.println("Enter input year: ");
            input.setInputYear();
            this.yearOfRelease = input.getUserInputInt();
        }*/

    /**
     * THis method sets the ISBN number by calling the scanner object in the UserInput class
     */
    public void setIsbnNumber(){
        System.out.print("Enter ISBN Number: ");
        input.setInputInt();
        this.isbnNumber = input.getUserInputInt();
    }

    /**
     * THis method sets the author name by calling the scanner object in the UserInput class
     */
    public void setAuthor(){
        System.out.print("Enter author name: ");
        input.setInputString();
        this.author = input.getUserInputString();
    }


    /**
     * This method shows the info, both by overriding that of the superclass as well as
     * taking some of what is shown in the superclass.
     */
    @Override
    public void showInfo(){
        System.out.println("The author is: " + author);
        super.showInfo();
        System.out.println("The ISBN number is: " + isbnNumber);

    }
}
