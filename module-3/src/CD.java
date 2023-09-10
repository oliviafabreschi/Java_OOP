public class CD {

    private int yearOfRelease;
    private String title;

    private static int nrObjects;

    MyInput input = new MyInput();

    //Write a parameterless constructor that asks the user for the title and year of release
    public CD(){

        setTitle();
        setYear();
        nrObjects++;
        System.out.println(nrObjects);

    }

    public void setTitle(){
        input.setInputString();
        this.title = input.getUserInputTitle();
    }

    public void setYear(){
        input.setInputInt();
        this.yearOfRelease = input.getYearInt();

    }


    //Also provide the class CD with a method "writeInfo()"
    //that prints the title and year of release of the CD
    public void writeInfo(){
        //String title = input.getUserInputTitle();
       // int yearOfRelease= input.getYearInt();
        System.out.println("Title of CD is = " + this.title);
        System.out.println("Year of release is = " + this.yearOfRelease);


    }




}
