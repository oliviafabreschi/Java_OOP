/**
 * ett program som som skriver ut summan av de siffror som förekommer i ett heltal
 * som användaren matar in till programmet.
 * Själva beräkningen ska utföras av metoden sumDigits.
 *
 * @author: Olivia Fabreschi
 * @version: September 2023
 *
 */
public class Main {

    public static void main(String[] args) {
        Integer number = 0;
        UserInput input = new UserInput();
        input.welcomeMessage();
        input.setNumber();
        number = input.getNumber();
        System.out.println(number);

        Calculate calculate = new Calculate();
        calculate.sumDigits(number);
        calculate.showResult();

    }
}