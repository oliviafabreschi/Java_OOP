public class CD {

    private int yearOfRelease;
    private String title;

    private int x = 0;

    private int playingTime;
    private MusicPiece[] musicPieceArray;


    private static int nrObjects;

    MyInput input = new MyInput();

    //Write a parameterless constructor that asks the user for the title and year of release
    public CD(){

        setTitle();
        setYear();
        nrObjects++;
        setMusicPiecesArray();
        System.out.println(nrObjects);

    }

   /* När klassen fungerar, så modifiera klassen CD.
   Lägg till en privat instansvariabel som är referens till array av typen MusikStycke.
   Ändra på den parameterlösa konstruktorn till klassen CD, så att den även
    frågar användaren om hur många musikstycken som CD-skivan ska bestå av och skapar en sådan array med musikstycken.
*/
    public void setTitle(){
        System.out.print("Enter title of CD: ");
        input.setInputString();
        this.title = input.getUserInputString();

    }

    public void setMusicPiecesArray(){
        System.out.print("Enter how many music pieces are in CD: ");
        input.setInputInt();
        this.x = input.getUserInputInt();
        musicPieceArray = new MusicPiece[x];
        System.out.println("x is " + x);
        for (int i=0;i<x; i++){
            musicPieceArray[i] = new MusicPiece();
        }

    }

    public void setYear(){
        System.out.print("Enter year of CD: ");
        input.setInputYear();
        this.yearOfRelease = input.getUserInputInt();

    }


    //Also provide the class CD with a method "writeInfo()"
    //that prints the title and year of release of the CD
    public void writeInfo(){
        System.out.println("Title of CD is: " + this.title);
        System.out.println("Year of release is: " + this.yearOfRelease);
        //getting info for each song item
        for (int i=0;i<x; i++){
            System.out.println(musicPieceArray[i].toString());
        }
        calculatePlayingTime();
        //showing song total play time
        System.out.println("total album time is: "+ calculatePlayingTimeMinutes());


    }

    public int calculatePlayingTime(){

        for (int i=0;i<x; i++){
            int playingTimeIteration = musicPieceArray[i].getPlayingTime();
            playingTime += playingTimeIteration;
        }

        return playingTime;

    }

    public String calculatePlayingTimeMinutes(){
        double calculationResult = playingTime /60;
        double decimal = playingTime % 60;
        int rounded = (int) Math.round(calculationResult);
        int seconds = (int)decimal;

                return (" " + rounded + " minutes and " + seconds +" seconds");
    }




}
