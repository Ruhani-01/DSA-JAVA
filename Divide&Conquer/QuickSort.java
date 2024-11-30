public class QuickSort{

    public static void quickSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // For left array finding pivot index 
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[],int si, int ei){
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return  i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quickSort(arr, 0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}