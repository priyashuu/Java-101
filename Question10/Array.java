import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size =sc.nextInt();
        int [] arr = new int [size];
        System.out.println("enter the elements");
        for (int i =0 ; i<size; i++){
            arr[i] =sc.nextInt();
        }
        int item =4;
        int c=0;
        for (int i =0 ; i <size ; i ++ ){
            if (arr[i] ==item){
                c++;
            }
        }
        if (c > 0) {
            System.out.println("element is found");
        }
        else{
            System.out.println("not found");
        }
    }
}