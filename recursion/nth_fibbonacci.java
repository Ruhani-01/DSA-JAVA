public class nth_fibbonacci{
    public static int fibbonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibbonacci(5));
    }
}