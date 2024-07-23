import java.util.*;
public class Prime{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of n");
        n=sc.nextInt();
        int i=2;
        boolean flag=false;
        while(i<n){
            if(n%i==0){
                flag=true;
                break;
            }
            i++;
        }
        if(flag){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is  prime");
        }
    }
}