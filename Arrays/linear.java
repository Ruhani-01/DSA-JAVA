
public class linear{
    public static void main(String args[]){
        int arr[]={4,5,6,3,2,1};
        int k=5;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}