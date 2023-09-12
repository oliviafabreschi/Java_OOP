import java.util.Scanner;

public class MyInput {

    private int userInputYearInt;
    private String userInputTitleString;

    public void setInputYear(){
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;
               while (!validInput) {
                String userInputYear = scanner.nextLine();
                if (!userInputYear.matches("\\d+")) {
                    System.out.println("Not a valid input, try again");
                }
                else if (Integer.parseInt(userInputYear) >= 1000 && Integer.parseInt(userInputYear) <= 2023) {
                    userInputYearInt = Integer.parseInt(userInputYear);
                    validInput = true;

                }
                else{
                        System.out.printf("Not valid. Try again. %n");
                    }
            }
    }

    public void setInputInt()    {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            String userInputYear = scanner.nextLine();
            if (!userInputYear.matches("\\d+")) {
                System.out.println("Not a valid input, try again");
            }
            else if (Integer.parseInt(userInputYear) >= 0 && (Integer.parseInt(userInputYear) <= 999999999)) {
                userInputYearInt = Integer.parseInt(userInputYear);
                validInput = true;

            }
            else{
                System.out.printf("Not valid. Try again. %n");
            }
        }
    }

    public void setInputString(){
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            String userInputTitle = scanner.nextLine().trim();

            if(userInputTitle.isEmpty()) {
                System.out.println("Null input");
            }
            else {
                userInputTitleString = userInputTitle;
                validInput = true;
            }
        }
    }


    public int getUserInputInt(){
        return this.userInputYearInt;

    }

    public String getUserInputString(){
        return this.userInputTitleString;
    }

}
