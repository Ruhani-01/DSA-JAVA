public class clear_i_bit{
    public static int clear(int a, int i){
        int bitMask=~(1<<i);       
        return a&bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clear(5, 1));
    }
}