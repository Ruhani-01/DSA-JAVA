public class P_10{
    public static void main(String[] args) {
        int r=4;
        int c=8;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j<=i || j>=(c-i-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j<=(r-i-1)||j>=(r+i)){
                    System.err.print("* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println("");
        }
    }
    

}