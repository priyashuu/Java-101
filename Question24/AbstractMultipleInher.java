abstract class Shape {
    int dimensions1;
    int dimensions2;

    Shape (int d1, int d2){
        this.dimensions1=d1;
        this.dimensions2=d2;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle (int length ,int width){
        super(length, width);
    }
    @Override
    void printArea(){
        int area =dimensions1*dimensions2;
        System.out.println("Area of rectangle " + area);
    }
}
class Tri extends Shape{
    Tri (int base , int height){
        super(base,height);
    }
    @Override
    void printArea(){
        double area= 0.5 *dimensions1*dimensions2;
        System.out.println("Area of Triangle  " + area);
    }
}
class Circle extends Shape {
    Circle(int radius){
        super(radius, 0);
    }
    @Override
    void printArea() {
        double area = 3.14 *(dimensions1)* dimensions1;
        System.out.println("Area of  circle " + area);
    }

}

public class AbstractMultipleInher {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        Tri tri = new Tri(4, 5);
        Circle cir = new Circle(5);
        rect.printArea();
        cir.printArea();
        tri.printArea();
    }
    
}
