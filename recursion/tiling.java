public class tiling {
    public static  int ways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical=ways(n-1);
        int horizonatal=ways(n-2);
        return vertical+horizonatal;
    }
    public static void main(String args[]){
        System.out.println(ways(4));

    }
}