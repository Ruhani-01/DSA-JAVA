public  class P_9{
    public static void main(String[] args) {
        int n=5;
        int t;
        for(int i=0;i<n;i++){
            if(i%2==0){
              t=1;  
            }
            else{
                t=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(t);
                if(t==1){
                    t=0;
                }
                else{
                    t=1;
                }
            }
            System.err.println("");
        }
    }
}