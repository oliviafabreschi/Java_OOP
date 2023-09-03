public class Calculate {

    private int sum = 0;
    public int sumDigits(int n){
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
        return sum;
    }

    public void showResult(){
        System.out.printf("the result is %d", sum);
    }
}
