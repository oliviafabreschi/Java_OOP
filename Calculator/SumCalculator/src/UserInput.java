import java.util.Scanner;

public class UserInput {

    private Integer numberInput = 0;

    public void welcomeMessage(){
        System.out.printf("%nThis calculator calculates the sum of individual ");
        System.out.println("numbers in an entered integer. E.g. 23 -> 2+3 = 5." );

    }
    public int setNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEnter integer to be calculated: ");
        this.numberInput = scanner.nextInt();
        return numberInput;
    }

    public int getNumber(){
        return numberInput;

    }
}
