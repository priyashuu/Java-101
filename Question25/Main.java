abstract class Shape {
    int dimensions1;
    int dimensions2;
    Shape(int d1 , int d2){
        this.dimensions1=d1;
        this.dimensions2 =d2;
    }
    public abstract void Area();
        
    
}
 class Rectangle extends Shape {
    Rectangle(int length,int width){
        super(length,width);

    }
    @Override
   public void Area () {
      int  area= dimensions1*dimensions2;
      System.out.println("The area of rectangle " + area);
    }
 }
 class Tri extends Shape {
    Tri(int base,int height){
        super(base,height);

    }
  @Override
   public void Area () {
      double  area= 0.5 * dimensions1*dimensions1;
      System.out.println("The area of triangle " + area);
    }
 }
 class Circle extends Shape {
    Circle(int radius){
        super(radius,0);

    }
    @Override
   public void Area () {
      double  area= 3.14 *dimensions1*dimensions1;
      System.out.println("The area of circle " + area);
    }
 }
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2,3);
        Circle cir = new Circle(6);
        Tri tri = new Tri (2,3);
        rect.Area();
        tri.Area();
        cir.Area();
        

    }
    
}
