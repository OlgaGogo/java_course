package classes_objects;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); //can be set this way
    }

    double getLenght(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (length * 2) + (width * 2);
    }

    public double calculateArea(){
        return length * width;
    }

}
