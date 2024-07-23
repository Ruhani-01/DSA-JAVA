public class Compare{
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2){
            System.out.println("Strings Are Equal");
        }
        else{System.out.println("Strings Are not Equal");}
        if(s1==s3){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings Are Not Equal");
        }
        //To compare only the value of the string there is s1.equals(s3) function which will compare only the values of string 
        if(s1.equals(s3)){
            System.out.println("Strings Are Equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}