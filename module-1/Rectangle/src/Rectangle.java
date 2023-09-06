/**
 * Rectangle class to set dimensions and colour
 * getters and setters
 * @author: Olivia Fabreschi
 * @version: September 2023
 *
 */
public class Rectangle {
//
    private final int width;
    private final int length;
    private static String colour;

    private int dimensions;

    /**
     * constructor for dimensions, not to be changeable
     * @param width of rectangle
     * @param length of rectangle
     */
    public Rectangle(int width, int length){
    this.width = width;
    this.length = length;
    }


    /**
     * method to be able to set the colour of the rectangle afterwards
     * @param colour of rectangle
     */
    public void setColour(String colour){
        this.colour = colour;
    }

    /**
     * method to get the colour
     * @return colour to another class
     */
    public String getColour(){
        return colour;
    }

    /**
     * calculates the dimensions of the rectangle
     * @return dimensions
     */
    public int getDimensions(){
        dimensions = length * width;
        return dimensions;
    }

    /**
     * prints the results of the object grouped together
     * @param instanceName of instance of object
     */
    public void printResult(String instanceName){
        System.out.println(instanceName + " info: ");
        System.out.println("width is "+ width);
        System.out.println("length is "+ length);
        System.out.println("colour is " + colour);
        System.out.printf("dimensions are "+ getDimensions()+ "%n%n");

    }

}
