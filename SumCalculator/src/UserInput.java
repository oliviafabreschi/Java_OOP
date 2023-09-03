import java.util.Scanner;

public class UserInput {

    private Integer numberInput;
    private String userInput = "";
    /**
     * Shoes welcome message on screen initially
     */
    public void welcomeMessage(){
        System.out.printf("%nThis calculator calculates the sum of individual ");
        System.out.println("numbers in an entered integer. E.g. 23 -> 2+3 = 5." );
        System.out.println("Type exit to exit");

    }

    /**
     * Scans in the number to be calculated from the user
     * Checks if it is a valid input or not
     * Loops over input until system is exited by "exit"
     * Returns the number in Int format, for the getter method
     */
    public void setInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEnter integer to be calculated, or type \"exit\" to exit: ");
        userInput = scanner.nextLine();
    }

    public void setNumber(){
        if (userInput.equals("exit")){
            exitProgram();
        }
        else if (!userInput.matches("\\d+")){
            System.out.print("Not a valid input, try again");
            //this.numberInput = null;
        }
        else
            this.numberInput = Integer.valueOf(userInput);
    }

    /**
     * getter method to get to private number
     * @return the original number input to be used in calculations
     */
    public Integer getNumber(){
        return numberInput;

    }

    public void exitProgram(){
        System.out.println("Exiting program");
        System.exit(0);
    }
}
