public class Max_Subarray{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                    int sum_t=0;
                for(int k=i;k<=j;k++){
                    sum_t+=arr[k];
                    if(ans<sum_t){
                        ans=sum_t;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}