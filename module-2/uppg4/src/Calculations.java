import javax.swing.*;

/**
 * This class does all the maths behind the calculations
 * takes in the JTextField objects and converts them to int
 * to be calculated
 * @author Olivia Fabreschi
 * @Version Sep 2023
 *
 */
public class Calculations {

    /**
     * parses the JTextField input into an into to be able to do the calculations
     * @param input in JTextField format
     * @return the int of each nr for calculations
     */
    public int parsingInput(JTextField input){
        String text = input.getText().trim();
        int nrInput = Integer.parseInt(text);
        return nrInput;
    }

    /**
     * calculation for the plus
     * @param input1 user input nr 1 in int
     * @param input2 user input nr 2 in int
     * @return the sum
     */
    public int plusCalculation(JTextField input1, JTextField input2){
        int value1 = parsingInput(input1);
        int value2 = parsingInput(input2);
        int sum = value1 + value2;
        return sum;

    }
    /**
     * calculation for the minus
     * @param input1 user input nr 1 in int
     * @param input2 user input nr 2 in int
     * @return the difference
     */
    public int minusCalculation(JTextField input1, JTextField input2){
        int value1 = parsingInput(input1);
        int value2 = parsingInput(input2);
        int sum = value1 - value2;
        return sum;

    }

    /**
     * calculation for the multiply
     * @param input1 user input nr 1 in int
     * @param input2 user input nr 2 in int
     * @return the product
     */
    public int multiplyCalculation(JTextField input1, JTextField input2){
        int value1 = parsingInput(input1);
        int value2 = parsingInput(input2);
        int sum = value1 * value2;
        return sum;

    }

    /**
     * calculation for the division
     * @param input1 user input nr 1 in int
     * @param input2 user input nr 2 in int
     * @return the quotient
     */
    public int divisionCalculation(JTextField input1, JTextField input2){
        int value1 = parsingInput(input1);
        int value2 = parsingInput(input2);
        int sum = value1 / value2;
        return sum;

    }
}
