import java.util.*;
public class sum_n{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int s=0;
        int i=1;
        while(i<=n){
            s+=i;
            i++;
        }
        System.out.println("Sum Till "+n+"is "+s);


    }
}