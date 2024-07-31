public class Power_2{
    public static boolean check(int a){
        if((a&a-1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        if(check(8)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}