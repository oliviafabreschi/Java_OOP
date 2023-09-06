/**
 * Program that creates objects of a rectangle
 * Colour can be set afterwards, width and height not able to change
 * @author: Olivia Fabreschi
 * @version: September 2023
 */
public class Main {
    public static void main(String[] args) {
        //instantiating the objects
        Rectangle rektangel1 = new Rectangle(10, 4);
        Rectangle rektangel2 = new Rectangle(5, 3);
        //setting the colour of the last created instance object
       // rektangel2.setColour("pink");
        //getting the colour of this instance object and setting it to the first one,
        //but with static attribute this is no longer needed
        //String lastColour = rektangel2.getColour();
        //rektangel1.setColour(lastColour);
        //printing results
        rektangel1.printResult("rektangel1");
        rektangel2.printResult("rektangel2");

        //checking to see how the static attribute holds up
        rektangel1.setColour("orange");
        //printing results
        rektangel1.printResult("rektangel1");
        rektangel2.printResult("rektangel2");
    }


}