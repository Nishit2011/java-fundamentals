package objects;

public class Rectangle {

    private int length;
    private int breadth;
    private int sides =4;

    //below is a constructor
    //initial values being set
    public Rectangle(){
        setLength(0);
        setBreadth(0);
    }

    //below is a constructor
    //initial values are set to those that gets passed
    public Rectangle(int length, int breadth){
        setLength(length);
        setBreadth(breadth);
    }

    public  int getPerimeter(int length, int breadth){
        return 2*(length+breadth);
    }

    public  int getArea(){
        return length*breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;

    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
