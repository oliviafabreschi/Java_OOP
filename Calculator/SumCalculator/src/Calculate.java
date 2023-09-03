
public class Calculate {

    private int sum = 0;

    /**
     *
     * @param n number to input from user
     * assigns to sum variable the sum of all individual chars
     */
    public void sumDigits(int n){
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

    /**
     * Prints the result on the terminal
     * @param n takes parameter to only show it if the number has gone through
     *          the program, i.e. isn't still -1
     */
    public void showResult(int n){
        if (n != -1){
            System.out.printf("the result is %d", sum);
        }

    }
}
