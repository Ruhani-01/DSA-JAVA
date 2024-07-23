import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char startChar = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(startChar + j));
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
