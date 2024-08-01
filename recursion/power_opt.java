public class power_opt{
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int half=power(x, n/2)*power(x, n/2);
        if(n%2==0){
            return half;
        }
        else{
            return x*half;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}