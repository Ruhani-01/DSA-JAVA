import java.util.*;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income;
        float t = 0;  // Initialize t to avoid compilation error
        System.out.println("Enter Income");  // Changed to System.out.println
        income = sc.nextInt();
        if (income < 500000) {
            t = 0;
        } else if (income >= 500000 && income < 1000000) {
            t = 0.2f * income;  // Use 0.2f to make it a float literal
        } else if (income >= 1000000) {
            t = 0.3f * income;  // Use 0.3f to make it a float literal
        }
        System.out.println("Tax To Pay is ----- " + t);
    }
}
