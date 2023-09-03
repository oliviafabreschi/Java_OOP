/**
 * ett program som läser in heltal och beräknar summan och medelvärdet av de inlästa värdena.
 * Programmets inläsning av värden ska avslutas om det inlästa talet är 0.
 * steg:
 * 1. menu som visar vad göra och 0 för att avsluta
 * 2. inläsning av input
 * 3. metod för att omvandla
 * 4. skriva ut resultat
 *
 */

public class Main {
    //Create an object of Input called input.
    static Input input = new Input();
    public static void main(String[] args) {
        //instantiating the class
        Integer nominator = 1;
        Integer denominator = 1;
        double result = 0.0;


        System.out.println("calculator!");
        System.out.println("enter your values to be calculated, 0 input exits the program!");
    //loop that continuously gets input unless 0 is entered
        while (nominator != 0 || denominator != 0)
        {
            nominator = getNominator();
            if (nominator == 0)
            {
                System.out.println("exiting program");
                System.exit(0);

            }
            denominator = getDenominator();
            if (denominator == 0)
            {
                System.out.println("exiting program");
                System.exit(0);

            }
            //method to calculate calling nominator and denominator
            result = calculate(nominator, denominator);
            //method to print
            printResult(result);

        }
        System.out.println("numerator is " + nominator);
        System.out.println("denominator is " + denominator);
    }

    /**
     *
     * @return the numerator to be calculated
     */
    public static Integer getNominator(){
        System.out.println("Enter numerator to be entered: ");
        return input.readInt();

    }
    /**
     *
     * @return the denominator to be calculated
     */
    public static Integer getDenominator(){

        System.out.println("Enter denomator to be entered: ");
        return input.readInt();
    }

    /**
     *
     * @param nominator
     * @param denominator
     * @return the calculation of the average
     */
    public static double calculate(int nominator, int denominator){
        return (double) nominator /denominator;
    }

    /**
     *
     * @param result
     * prints out the result on the screen
     */
    public static void printResult(double result){
        System.out.println("result is " + result);

    }


}
