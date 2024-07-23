import java.util.*;
public  class even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.err.println("Enter The Number");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even number");
        }
        else{
            System.out.println(a+"is Odd number");
        }
    }
}