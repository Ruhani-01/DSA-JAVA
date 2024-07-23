import java.util.*;
public class Inbuilt{
    public static void main(String[] args) {
        int arr[]={5,4,1,3,6};
        Arrays.sort(arr,0,arr.length-1);
        //For sorting in reverse order
        // Arrays.sort(arr,0,arr.length-1,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}