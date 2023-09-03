import java.util.Scanner;

public class UserInput {

    private Integer numberInput = 0;
    private String userInput = "";
    /**
     * Shoes welcome message on screen initially
     */
    public void welcomeMessage(){
        System.out.printf("%nThis calculator calculates the sum of individual ");
        System.out.println("numbers in an entered integer. E.g. 23 -> 2+3 = 5." );
        System.out.println("Press n to exit");

    }

    /**
     * Scans in the number to be calculated from the user
     * Checks if it is a valid input or not
     * Loops over input until system is exited by "n"
     * Returns the number in Int format, for the getter method
     */
    public void setInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEnter integer to be calculated, or press \"n\" to exit: ");
        userInput = scanner.nextLine();
    }

    public void setNumber(){
        if (userInput.equals("n")){
            this.numberInput = -2;
        }
        else if (!userInput.matches("\\d+")){
            System.out.print("Not a valid input, try again");
            this.numberInput = -1;
        }
        else
            this.numberInput = Integer.valueOf(userInput);
    }

    /**
     * getter method to get to private number
     * @return the original number input to be used in calculations
     */
    public int getNumber(){
        return numberInput;

    }

    /**
     * getter method to get user Input in string format
     * @return user input i string format
     */
    public String getUserInput(){
        return userInput;
    }

    public void exitProgram(){
        System.out.println("Exiting program");
        System.exit(0);
    }
}
