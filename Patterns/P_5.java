public class P_5{
    public static void main(String[] args) {
        int row=4;
        int col=4;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || i==(row-1)){
                    System.out.print("* ");
                }
                else{
                    if(j==0||j==(col-1)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}