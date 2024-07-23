public class P_8{
    public static void main(String[] args) {
        int n=5;
        int t=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(t+" ");
                t++;
            }
            System.err.println("");
        }
    }
}