public class Reverse{
    public static void main(String args[]){
        int arr[]={2,3,4,5,62,44};
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}