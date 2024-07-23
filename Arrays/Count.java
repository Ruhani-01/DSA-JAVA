public class Count{
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int c[]= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            c[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<c.length;i++){
            while(c[i]>0){
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}