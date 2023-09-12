public class MusicPiece {

    //title (of the song)
    //
    //artist (who performs the song)
    //
    //playing time (length of the song in seconds)

    private String title;
    private String artist;
    private int playingTime;
    MyInput input = new MyInput();

    //Provide the class with a parameterless constructor
    // that asks the user of the application for the title, artist, playing time of the piece of music.

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

    public String toString(){
        return ("The song " + this.title + " by " + this.artist + " is " + this.playingTime + " seconds long");

    }

    public int getPlayingTime() {
        return playingTime;
    }
}
