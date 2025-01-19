class Animal {
    void sleep () {
        System.out.println("Animal is sleeping");
    }
}
interface Walkable{
    void walk();
}
interface Eatable{
    void eat();
}
interface Flyable {
    void fly();

    
}

class Bird extends Animal implements Walkable, Eatable,Flyable{
    @Override
    public void walk () {
        System.out.println("Bird is walking");
    }
    @Override 
    public void eat (){
        System.out.println("Bird is Eating");
    }
    @Override
    public void fly () {
        System.out.println("Bird can fly too 🥹");
    }
}



public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sleep();
        bird.eat();
        bird.walk();
        bird.fly();
    }
   

    
}
