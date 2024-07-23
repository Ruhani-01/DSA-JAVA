public  class P_11{
    public static void main(String[] args) {
        int n=5;
        int col=2*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<col-i;j++){
                int c=col-i;
                if(j>=c-n){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}