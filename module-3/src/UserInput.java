/**
 * A program that parses the input of the user using Scanner
 * either into an int or String
 *
 * @author: Olivia Fabreschi
 * @version: September 2023
 *
 */import java.util.Scanner;

public class UserInput {
    private int userInputYearInt;
    private String userInputTitleString;

    /**
     * Scans in the number to be calculated from the user
     * Checks if it is a valid input or not, and if it is a valid year
     * Returns the number in Int format, for the getter method
     */
    public void setInputYear(){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            String userInputYear = scanner.nextLine();
            if (!userInputYear.matches("\\d+")) {
                System.out.println("Not a valid input, try again");
            }
            else if (Integer.parseInt(userInputYear) >= 1000 && Integer.parseInt(userInputYear) <= 2023) {
                userInputYearInt = Integer.parseInt(userInputYear);
                validInput = true;

            }
            else{
                System.out.printf("Not valid. Try again. %n");
            }
        }
    }

    /**
     * Scans in the number to be calculated from the user
     * Checks if it is a valid input or not
     * Returns the number in Int format, for the getter method
     */
    public void setInputInt()    {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            String userInputYear = scanner.nextLine();
            if (!userInputYear.matches("\\d+")) {
                System.out.println("Not a valid input, try again");
            }
            else if (Integer.parseInt(userInputYear) >= 0 && (Integer.parseInt(userInputYear) <= 999999999)) {
                userInputYearInt = Integer.parseInt(userInputYear);
                validInput = true;

            }
            else{
                System.out.printf("Not valid. Try again. %n");
            }
        }
    }
    /**
     * Scans in the number to be calculated from the user
     * Checks if it is a valid input or not
     * Returns the number in String format, for the getter method
     */
    public void setInputString(){
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            String userInputTitle = scanner.nextLine().trim();

            if(userInputTitle.isEmpty()) {
                System.out.println("Null input");
            }
            else {
                userInputTitleString = userInputTitle;
                validInput = true;
            }
        }
    }

    /**
     * Gets the int value
     * @return int value
     */
    public int getUserInputInt(){
        return this.userInputYearInt;

    }

    /**
     * gets the string value
     * @return string value
     */
    public String getUserInputString(){
        return this.userInputTitleString;
    }

}
