/*. Basic Shape Calculator:
•	Create a Shape class with a method to calculate area (abstract).
•	Create subclasses like Circle, Rectangle, and Triangle inheriting from Shape and implementing their respective area calculations.
•	Demonstrate polymorphism by creating an array of Shape objects and calculating the area of each shape using a loop.
 */

abstract class Shape{
    abstract double calArea();
}
class Circle extends Shape{
    float radius;

    public Circle (float radius){
        this.radius=radius;

    }
    double calArea() {
        return radius * radius;
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    double calArea(){
        return length*width;
    }
}
class Triangle extends Shape{
    int base;
    int height;


    public Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }


    double calArea(){
        return 0.5 * base * height;

    }
}    

public class BasicShapeCal{
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10,5);
        shapes[2] = new Triangle(5,10);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calArea());
        }

    }

}
