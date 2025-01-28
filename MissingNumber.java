
public class MissingNumber extends Solution {
    public static void main(String[] args) {
        int[] nums={1,2,0,4,5,6,7};
        Solution obj=new Solution();
        int val=obj.missingNumber(nums);

        System.out.println("The missing number is "+val);

    }}
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n=nums.length;
        int ans=(n*(n+1)/2);  //This is the formula to find missing element in the array
        int fin=ans-sum;      //It works only for natural numbers (starting from 1) in consecutive order.
        return fin;
    }
}