public class Prefix{
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=j==0?pre[j]:pre[j]-pre[i-1];
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        System.out.println(maxsum);


    }
}