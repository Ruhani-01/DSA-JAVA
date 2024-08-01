public class check_array{
    public static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,2};
        if(check(arr, 0)){
            System.out.println("Yes array is sorted");
        }
        else{
            System.out.println("No array is not sorted");
        }
    }
}