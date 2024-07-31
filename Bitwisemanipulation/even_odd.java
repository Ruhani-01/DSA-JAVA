public class even_odd{
    public static boolean  check(int a){
        if((a&1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        if(check(6)){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}