import java.util.*;
public class MatrixAddtion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1 [] [] = new int[3][3] ;
        int arr2 [] [] = new int [3] [3];
        int result [] [] = new int [3] [3] ;
        System.out.println("enter the elements arr1");
        for (int i =0 ; i <3 ; i ++  ){
            for (int j = 0 ; j<3 ; j ++) {
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the elements arr2");
        for (int i =0 ; i <3 ; i ++  ){
            for (int j = 0 ; j<3 ; j ++) {
                arr2[i][j]= sc.nextInt();
            }

        }
        System.out.println("the matrix addition will be");
        for (int i =0 ; i <3 ; i ++  ){
            for (int j = 0 ; j<3 ; j ++) {
                result[i][j]= arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
