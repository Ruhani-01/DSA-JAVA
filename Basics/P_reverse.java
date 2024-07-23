import java.util.*;
public class P_reverse{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.err.println("Reverse Of Number is "+rev);
    }
}