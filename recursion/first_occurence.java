public class first_occurence{
    public static int first(int arr[], int i, int k){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        return first(arr, i+1, k);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,3};
        System.out.println(first(arr, 0, 3));
    }
}