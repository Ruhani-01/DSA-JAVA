public class search{
    public static void stair(int matrix[][],int k){
        int row=0;
        int col=matrix[0].length-1;
        int ans=-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==k){
                System.out.print("Found At "+row+" "+col);
            }
            else if(matrix[row][col]>k){
                row++;
            }
            else{
                col--;
            }
        }

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        stair(matrix,7);

    }
}