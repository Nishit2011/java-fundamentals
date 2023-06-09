package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        //this will use the default constructor values defined
        //no need to import Reactangle class because its part of the same package
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setBreadth(25);

        int areasOfRoom1 = room1.getArea();

        //this will use the the values passed as args as the initial value of the constructor
        Rectangle room2 = new Rectangle(30,75);
        int areaOfRoom2 = room2.getArea();

        double totalArea = areasOfRoom1 + areaOfRoom2;
        System.out.println("Areas of both room: "+ totalArea);

    }
}
