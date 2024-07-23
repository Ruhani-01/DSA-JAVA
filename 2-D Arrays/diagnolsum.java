public class diagnolsum{
    public static void diagnolsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
            sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.print(sum);

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagnolsum(matrix);

    }
}