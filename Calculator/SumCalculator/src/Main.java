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

        //only printing message once
        input.welcomeMessage();
        //loops over inputs until exiting program based on menu item "n"
        while (true) {
            //creating object here so that sum resets to 0 each time
            Calculate calculate = new Calculate();
            //setting and getting the user input, only parsing to int where applicable
            input.setInput();
            if (input.getUserInput().equals("n"))
                input.exitProgram();
            else{
                input.setNumber();
                int number = input.getNumber();
                //calculating and showing results
                calculate.sumDigits(number);
                calculate.showResult(number);
            }
        }


    }
}