class Outer{
    private class Inner {
        private void display () {
            System.out.println("Private Method of Inner class");
        }
    }
    public void tryAccess(){
        Inner inner = new Inner();
        inner.display();
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.tryAccess();
    }
    
}
