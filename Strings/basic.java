// public class basic{
//     public static void main(String args[]){
//         String str="Manuu";
//         System.out.println(str);
//     }
// }

//Input / Output in the string 
import  java.util.*;
public class basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.print(name);
        //Printing the length of string 
        System.out.println(name.length());
        //Concatination of the string 
        String first="Love";
        String last="Maluja";
        String Full=first+last;
        System.err.println(first.charAt(0));
        System.out.println(first.substring(1, 3));

    }
}