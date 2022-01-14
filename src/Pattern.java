import java.util.regex.Matcher;

public class Pattern {
    public static void main(String args[]) {
        // int n = 5;
        // // Outer Loop for number of Rows
        // for (int i = 0; i < n; i++) {
        // // Inner loop for printing '*' in each column.
        // for (int j = 0; j < n; j++) {
        // // We add two spaces to match shape of a square.
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // // Outer Loop for number of Rows
        // for (int i = 0; i < n; i++) {
        // // Inner loop for printing '*' in each column.
        // for (int j = 0; j < n; j++) {
        // // For first row and last row we print '*' and for every other row we print
        // the
        // // '*' at boundary region.
        // if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
        // System.out.print("* ");
        // }
        // // Otherwise we print blank space.
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // int n = 7;
        // // Outer Loop for number of Rows
        // for (int i = 0; i < n; i++) {
        // // Inner loop for printing '*' in each column.
        // for (int j = 0; j < n; j++) {
        // // We check for major and minor diagonal and print * for each such cell .
        // if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || j == n - i - 1)
        // {
        // System.out.print("* ");
        // }
        // // Otherwise we print blank space.
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // // Outer Loop for number of Rows
        // for (int i = 0; i < n; i++) {
        // // Print Spaces before each row
        // for (int k = 0; k < n - i; k++) {
        // System.out.print(" ");
        // }
        // // printing '*' in each column.
        // for (int j = 0; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int n = 5;
        // Outer Loop for number of Rows
        for (int i = 0; i < n; i++) {
            // printing '*' in each column.
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static Pattern compile(String theRegex) {
        return null;
    }

    public Matcher matcher(String str2Check) {
        return null;
    }
}
