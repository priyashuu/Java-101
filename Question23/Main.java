class FinalKey{
    final int finalVariable;
    FinalKey(int value) {
        finalVariable = value;
    }
    public void showfinal () {
        final int localFinal =10;
        System.out.println(localFinal);
        System.out.println(finalVariable);
    }
}


public class Main {
    public static void main(String[] args) {
        FinalKey finalkey = new FinalKey(100);

        finalkey.showfinal();
       
        
    }
}
