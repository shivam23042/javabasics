import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Read the two integers x and y for the current test case
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Find the minimum and maximum of x and y
            int min = Math.min(x, y);
            int max = Math.max(x, y);
            
            // Output the minimum and maximum
            System.out.println(min + " " + max);
        }
        
        // Close the scanner
        scanner.close();
    }
}
