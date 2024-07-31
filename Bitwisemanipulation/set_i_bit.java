public class set_i_bit{
    public static int set(int a ,int i){
        int bitMask=1<<i;
        return a|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(set(5,1));
    }
}