/**
 * Ditt program ska läsa in antal grader Fahrenheit i form av "double" från tangentbordet,
 *därefter omvandla till motsvarande antal grader Celsius och visa resultatet i kommandotolken
 *
 */
import java.util.Scanner;
public class MyInput {
    Scanner scanner = new Scanner(System.in);
    public static int sumNumbers(int x, int y){
        return x + y;
    }
    private String readString()
    {
        // Declare and initialize the string
        String stringText = " ";

        // Get the string from the keyboard
        try
        {
            System.out.println("Enter degrees in farenheit to be converted to celcius: ");
            stringText = scanner.nextLine();
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

        // Return the string obtained from the keyboard
        return stringText;
    }


    /**
     * L�ser ett heltal fr�n tangentbordet.
     *
     * @return Returnerar det l�sta talet i form av en "int"
     */
    public int readInt()
    {
        return Integer.parseInt(readString());
    }

    /**
     * L�ser ett decimaltal fr�n tangentbordet.
     *
     * @return Returnerar det l�sta talet i form av en "double"
     */
    public double readDouble()
    {
        return Double.parseDouble(readString());
    }


}
