public class get_i_bit{
    public static int get(int a, int i){
        int bitMask=1<<i;
        if((a&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get(5,3));
    }
}