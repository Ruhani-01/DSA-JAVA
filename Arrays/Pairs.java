public class Pairs{
    public static void main(String args[]){
        int arr[]={3,4,5,6,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
            System.out.println("");
        }
    }
}