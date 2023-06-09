package objects;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //instantiating the class that will help me in accessing a non static method from a static main method
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        //using the object created above to call non-static method.
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        int totalArea = calculator.getAreaOfRoom(room1, room2);

        System.out.println("Areas of both room: "+ totalArea);

    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the room");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the room");
        int breadth = scanner.nextInt();
        return new Rectangle(length, breadth);
    }

    public int getAreaOfRoom(Rectangle room1, Rectangle room2){
        return (room1.getArea() + room2.getArea());
    }
}
