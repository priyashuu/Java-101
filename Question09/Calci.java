import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        System.out.println("Choose an operations");
        System.out.println("1 Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("result " + result);

                break;
            case 2:
                result = num1 - num2;
                System.out.println("result " + result);

                break;
            case 3:
                result = num1 * num2;
                System.out.println("result " + result);

                break;
            case 4:
                result = num1 / num2;
                System.out.println("result " + result);

                break;

            default:
               System.out.println("Invalid choice");
                break;
        }
    }

}
