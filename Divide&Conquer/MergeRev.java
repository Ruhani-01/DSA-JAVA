public class MergeRev{
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        for(int i=si;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("-------");
        int mid=si+(ei-si)/2;
        mergeSort(arr, si,mid);
        mergeSort(arr, mid+1, ei);
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
    }
}