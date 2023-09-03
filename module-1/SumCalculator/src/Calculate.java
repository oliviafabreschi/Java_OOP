/**
 * A program that show the sum of all entered digits from an int
 * that a user feeds into the program.
 * the calculation is done by "sumDigits" method
 *
 * @author: Olivia Fabreschi
 * @version: September 2023
 *
 */
public class Calculate {

    private int sum = 0;

    /**
     *
     * @param n number to input from user
     * assigns to sum variable the sum of all individual chars
     */
    public void sumDigits(Integer n){
       //input in string version
        String valueString = String.valueOf(n);
        //length of string input
        int length = valueString.length();

        //loop over all to add them
        for (int i = 0; i < length; i++) {
            char characterChar = valueString.charAt(i);
            int characterInt = Character.getNumericValue(characterChar);
            this.sum += characterInt;
        }

    }

    public void reset(){
        sum = 0;
    }

    /**
     * Prints the result on the terminal
     * @param n takes parameter to only show it if the number has gone through
     *          the program, i.e. isn't still -1
     */
    public void showResult(Integer n){
        if (n != null){
            System.out.printf("the result is %d", sum);
        }

    }
}
