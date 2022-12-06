package abstraction;

public class ShapeTester {

    public static void main(String[] args){

        //check why is it not overridden
        Shape rectangle = new Rectangle(4, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
