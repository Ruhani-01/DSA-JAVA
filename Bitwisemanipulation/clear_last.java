public class clear_last{
    public static int clear(int a, int i){
        int bitMask=(~0)<<i;
        return a&bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear(15, 2));
    }
}