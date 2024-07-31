public class clear_range{
    public static int clear(int a,int i, int j){
        int bitA=(~a)<<(j+1);
        int bitB=(1<<i)-1;
        int bitMask=bitA |  bitB;
        return (a & bitMask);
    }
    public static void main(String[] args) {
        
    }
}