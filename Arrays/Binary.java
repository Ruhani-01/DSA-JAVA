public  class Binary{
    public static void main(String[] args) {
        int arr[]={10,12,13,14,18,50};
        int k=13;
        int s=0;
        int e=arr.length;
        int ans=-1;
        while(s<=e){
            int m=(s+e)/2;
            if(k==arr[m]){
                ans=m;
                break;
            }
            if(k<arr[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        System.out.println(ans);
    }
}