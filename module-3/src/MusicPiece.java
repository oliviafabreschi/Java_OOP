/**
 * This is a class which stores information that will be connected
 * to the CD class through an array object referral
 *
 * @author Olivia Fabreschi
 * @Version Sep 2023
 */
public class MusicPiece {

    private String title;
    private String artist;
    private int playingTime;
    UserInput input = new UserInput();

    //Provide the class with a parameterless constructor
    // that asks the user of the application for the title, artist, playing time of the piece of music.

    /**
     * The constructor gets the information for the song
     */
    public MusicPiece(){
        System.out.print("Enter title of song: ");
        input.setInputString();
        this.title = input.getUserInputString();
        System.out.print("Enter artist of song: ");
        input.setInputString();
        this.artist = input.getUserInputString();
        System.out.print("Enter playing time in seconds: ");
        input.setInputInt();
        this.playingTime = input.getUserInputInt();

    }

    /**
     * This method gets the parameters for this class
     * @return a string that can be printed out
     */
    public String toString(){
        return ("The song " + this.title + " by " + this.artist + " is " + this.playingTime + " seconds long");
    }

    /**
     * This is a getter method for the playing time of each object of this class
     * in order for it to be calculated in the CD class
     * @return int of nr of seconds of playing time
     */
    public int getPlayingTime() {
        return playingTime;
    }
}
