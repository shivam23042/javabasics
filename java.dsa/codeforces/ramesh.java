import java.util.*;
public class ramesh {
     //Function to find the longest common prefix of two strings
    public static int longestCommonPrefix(String s1, String s2) {
        int i = 0;
         while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
             i++;
         }
         return i;
     }

    // Function to compute the maximal possible LCP for a division of string s into k continuous substrings
    public static int computeLCP(String s, int k) {
        int n = s.length();
        int maxLCP = 0;
        for (int i = 0; i <= n - k; i++) {
            int lcp = longestCommonPrefix(s.substring(i, i + k - 1), s.substring(i + k - 1));
            maxLCP = Math.max(maxLCP, lcp);
        }
        return maxLCP;
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int t = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Input values for this test case
            int n = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String s = scanner.nextLine();

            // Compute and output the maximal LCP for each value of k in the range [l, r]
            for (int k = l; k <= r; k++) {
                int maxLCP = computeLCP(s, k);
                System.out.print(maxLCP + " ");
            }
            System.out.println(); // Move to the next line for the next test case
        }

        scanner.close();
    }
}
