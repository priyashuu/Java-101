import java.util.*;


public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in );
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the no of terms : ");
        int n =sc.nextInt();
        double sum= 0;
        for (int i = 0 ; i<=n ;i++){
            sum+= Math.pow(x, i);
        }
        System.out.println("The sum of series "+ sum);
        sc.close();
    }
    
}
