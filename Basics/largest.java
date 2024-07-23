import java.util.*;
public  class largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter First number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        if(a>b){
            System.err.println(a);
        }
        else{
            System.err.println(b);
        }

    }
}