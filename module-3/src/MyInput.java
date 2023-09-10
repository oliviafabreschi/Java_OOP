import java.util.Scanner;

public class MyInput {

    private int userInputYearInt;
    private String userInputTitleString;

    public void setInputInt(){
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;
               while (!validInput) {
                System.out.print("Enter year of release of CD: ");
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

    public void setInputString(){
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            System.out.print("Enter title of CD: ");
            String userInputTitle = scanner.nextLine();
            if(userInputTitle.equals(" ")){
                System.out.println("Empty input");
            }
            else if(userInputTitle.isEmpty()) {
                System.out.println("Null input");

            }
            else if(!userInputTitle.matches("[A-Za-z0-9]+")){
                System.out.println("Not valid input");
            }
            else {
                userInputTitleString = userInputTitle;
                validInput = true;
            }
        }
    }


    public int getYearInt(){
        return this.userInputYearInt;

    }

    public String getUserInputTitle(){
        return this.userInputTitleString;
    }

}
