public class  palindrome{
    public static boolean is(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String st="Love";
        if(is(st)){
            System.out.println("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}