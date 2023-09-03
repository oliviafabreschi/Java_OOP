

import java.util.Scanner;
public class Input {
    Scanner scanner = new Scanner(System.in);

    /**
     *
     * @return the string input, checking for errors
     */
    private String readString() {
        // Declare and initialize the string
        String stringText = " ";
        // Get the string from the keyboard
        try {
            stringText = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

            // Return the string obtained from the keyboard
            return stringText;
        }

    /**
     * gets an int
     *
     * @return returns the string input into an Integer
     */
    public Integer readInt ()
    {
        return Integer.parseInt(readString());
    }


}