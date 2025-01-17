public class Factorial {
    //Recursive function
    public static int FactoralRec(int n) {
        if (n==0 || n==1){
            return n;

        }else {
            return n*FactoralRec(n-1);
        }
    }
    public static int FactoralIter(int n) {
        int fact=1;
        for (int i =1 ; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=7;
        if (n < 0) {
            System.out.println("factorial is not defined");
        }
        else{
            System.out.println(FactoralRec(n));
            System.out.println(FactoralIter(n));
        }
    }
       
}