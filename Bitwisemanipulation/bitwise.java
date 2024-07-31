public class bitwise{
    public static int AND(int a,int b){
        return a&b;   // Returning And 
    }
    public static int OR(int a,int b){
        return a|b;
    }
    public static int XOR(int a,int b){
        return a^b;
    }
    public static int Complement(int a){
        return ~a;
    }
    public static int left(int a,int i){
        return a<<i;
    }
    public static int right(int a ,int i)
    {
        return a>>i;
    }
    public static void main(String args[]){
        System.out.println(right(10,2));
    }

}