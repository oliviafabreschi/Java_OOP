/**
 *
 * Nu ska du skriva ett program som omvandlar Fahrenheit till Celsius.
 * Här följer en formel för omvandling från Fahrenheit till Celsius:
 * celsius = (5/9) * (fahrenheit - 32)
 * Author: Olivia Fabreschi
 * Date: September 2023
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Degree convertor, from farenheit to celcius!");

        double farenheit = 0.0;
        double celcius = 0.0;
        //if the method is not static, need to instantiate it before
        //and then you call it by using the object instance dot method
        MyInput input = new MyInput();
        //input.readInput();
        //when method is static, can call the class dot method directly.
        //without instantiating the class beforehand
        int result =  MyInput.sumNumbers(3, 4);
        int result2 = input.sumNumbers(5, 7);

        farenheit = input.readDouble();
        celcius = convertNumber(farenheit);

        printResult(celcius);

    }

    /**
     *
     *
     * @param farenheit
     * @return the converted double, farenheit to celcius
     */
    public static double convertNumber(double farenheit){
        return ((farenheit - 32.0) * (5.0 / 9.0));
    }

    public static void printResult(double celcius){
        System.out.println(celcius);
        // String roundedNumber = String.format("%.1f", celcius);
        System.out.printf("Degrees in celcius: %.2f degrees%n", celcius);



    }




}