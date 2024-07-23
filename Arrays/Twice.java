
public class Twice {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 4};
        int a = 0;  // Initialize a to 0
        for (int i = 0; i < arr.length; i++) {
            a = a ^ arr[i];
        }
        if (a == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
