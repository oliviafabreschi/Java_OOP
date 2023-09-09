import javax.swing.*;

public class Calculations {

    public int ParsingInput(JTextField input){
        String text = input.getText().trim();
        System.out.print(text);
        int nrInput = Integer.parseInt(text);
        return nrInput;
    }

    public int PlusCalcuation(JTextField input1, JTextField input2){
        int value1 = ParsingInput(input1);
        int value2 = ParsingInput(input2);
        System.out.println("case 1 in method, values in int: "+ value1 +" " + value2);
        int sum = 0;
        return sum;

    }

    public int MinusCalcuation(JTextField input1, JTextField input2){
        int value1 = ParsingInput(input1);
        int value2 = ParsingInput(input2);
        System.out.println("case 2 in method, values in int: "+ value1 +" " + value2);
        int sum = 0;
        return sum;

    }


    public int MultiplyCalcuation(JTextField input1, JTextField input2){
        int value1 = ParsingInput(input1);
        int value2 = ParsingInput(input2);
        System.out.println("case 3 in method, values in int: "+ value1 +" " + value2);
        int sum = 0;
        return sum;

    }

    public int DivisionCalcuation(JTextField input1, JTextField input2){
        int value1 = ParsingInput(input1);
        int value2 = ParsingInput(input2);
        System.out.println("case 4 in method, values in int: "+ value1 +" " + value2);
        int sum = 0;
        return sum;

    }
}
