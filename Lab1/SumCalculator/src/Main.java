/**
 * A program that show the sum of all entered digits from an int
 * that a user feeds into the program.
 * the calculation is done by "sumDigits" method
 *
 * @author: Olivia Fabreschi
 * @version: September 2023
 *
 */
public class Main {

    /**
     * Main to call all methods and classes
     * @param args Main method
     */
    public static void main(String[] args) {
        //creating the object from the input classes
        UserInput input = new UserInput();
        Calculate calculate = new Calculate();

        //only printing message once
        input.welcomeMessage();
        //loops over inputs until exiting program based on menu item "n"
        while (true) {
            //resetting sum to 0 each time
            calculate.reset();
            //setting and getting the user input, only parsing to int where applicable
            input.setInput();
            input.setNumber();
            Integer number = input.getNumber();
            //calculating and showing results
            calculate.sumDigits(number);
            calculate.showResult(number);
        }

    }


}