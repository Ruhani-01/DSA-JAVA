public class largest{
    public static void main(String args[]){
        int nums[]={4,2,4,6,8,20};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        System.out.println(largest);
    }
}