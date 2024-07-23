import java.util.*;
public class split{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int s_e=0;
        int s_o=0;
        while(n>0){
            int temp=n%10;
            if(temp%2==0){
                s_e+=temp;
            }
            else{
                s_o+=temp;
            }
            n=n/10;
        }
        System.err.println("sum of even"+s_e);
        System.err.println("sum of Odd"+s_o);
        

    }
}