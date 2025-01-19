interface Animal{
    void eat();
}
interface Bird{
    void fly();
}
class Bat implements Animal ,Bird {
    @Override
    public void eat(){
        System.out.println("Bat is eating insects");
    }
    @Override
    public void fly (){
        System.out.println("Bat is flying");
    }
}
public class MultipleInhertance {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
    
}
