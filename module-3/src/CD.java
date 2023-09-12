/**
 * This is a subclass of Media, which stores information about CDs
 * This also includes referring to an array of musicpieces objects, getting the information of each item
 * within the CD
 *
 * @author Olivia Fabreschi
 * @Version Sep 2023
 */
public class CD extends Media {

    //instantiating the variables
    private int x = 0;
    private MusicPiece[] musicPieceArray;
    private static int nrObjects;
    UserInput input = new UserInput();

    //A parameterless constructor that asks the user for the title and year of release
    //this is covered by the superclass, so no longer needed
    public CD(){
        //System.out.println("Enter info for CD: ");
        //settitle();
        //setYear();

        //creating the array for the music piece items to be stored
        setMusicPiecesArray();

       //to keep track of number of objects created
        nrObjects++;
        System.out.println(nrObjects);

    }

    /**
     * This method shows a message to the user before input is gathered
     * it overrides the one set by the super class
     * in order to be shown first before any input is collected
     */
    @Override
    public void printWelcome(){
        System.out.println("Welcome!");
        System.out.println("Enter input below for CD. ");
    }


//title no longer set here but in super class
/*    public void setTitle(){
        System.out.print("Enter title of CD: ");
        input.setInputString();
        this.title = input.getUserInputString();

    }*/

    /**
     * This creates the array for the music items
     * and assigns an object of each of the MusicPiece class in the array
     */
    public void setMusicPiecesArray(){
        System.out.print("Enter how many music pieces are in CD: ");
        input.setInputInt();
        this.x = input.getUserInputInt();
        musicPieceArray = new MusicPiece[x];
        for (int i=0;i<x; i++){
            musicPieceArray[i] = new MusicPiece();
        }

    }

/* method no longer needed due to superclass:

    public void setYear(){
        System.out.print("Enter year of CD: ");
        input.setInputYear();
        this.yearOfRelease = input.getUserInputInt();
    }
*/


    /**
     * This method shows the info, both by overriding that of the superclass as well as
     * taking some of what is shown in the superclass.
     */
    @Override
    public void showInfo(){
        super.showInfo();
        //getting info for each song item
        for (int i=0;i<x; i++){
            System.out.println(musicPieceArray[i].toString());
        }
        //showing song total play time
        System.out.println("total album time is: "+ calculatePlayingTimeMinutes());


    }

    /**
     * This calculates the playing time from each musicpiece class
     * @return a string that can be used in the showInfo method
     */
    public String calculatePlayingTimeMinutes(){
        int playingTime = 0;
        for (int i=0;i<x; i++){
            int playingTimeIteration = musicPieceArray[i].getPlayingTime();
            playingTime += playingTimeIteration;
        }
        double calculationResult = playingTime / 60;
        double decimal = playingTime % 60;
        int rounded = (int) Math.round(calculationResult);
        int seconds = (int)decimal;
        return (" " + rounded + " minutes and " + seconds +" seconds");
    }







}
