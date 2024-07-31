public class update_i_bit{
    public static int clear(int a , int i){
        int bitMask=~(1<<i);
        return a & bitMask;
    }
    public static int set(int a, int i){
        int bitMask=1<<i;
        return a & bitMask;
    }
    public static int update(int a , int i,int newBit){
        if(newBit==0){
            return clear(a, i);
        }
        else{
            return set(a, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(update(5, 2, 1));        
    }
}