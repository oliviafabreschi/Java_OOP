public class Rectangle {

    private final int width;
    private final int length;

    private final String colour;
    private int dimensions;

    public Rectangle(int width, int length, String colour){
    this.width = width;
    this.length = length;
    this.colour = colour;
    }


    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }
    public String getColour(){
        return colour;
    }


    public int getDimensions(){
        dimensions = (width*length) / 2;
        return dimensions;

    }

}
