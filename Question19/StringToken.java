import java.util.*;
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input);
        System.out.println("Tokens:");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        sc.close();

    }
    
}
