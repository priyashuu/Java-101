public class CenteredPyramidPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces to center-align the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars with a space in between
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
