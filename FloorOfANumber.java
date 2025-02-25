public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,13,18,23,34,45};
        int target=25;
        System.out.println(ceiling(arr,target));
    }

    public static int ceiling(int[] arr,int target){
        int start=0;
        int ans=-1;
        int end=arr.length;
        for(int i=0;i<arr.length;i++){
            int mid=(start+(end-start)/2);

            if(arr[mid]==target){
                return arr[mid];   //If target found return target.
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(end==-1){
            return -1;
        }
        return arr[end];       //If target not found returning largest small value of target.
    }

}

/*

Example 1:
Input:
arr = [2, 3, 5, 9, 14, 16, 18]
target = 15
Output:
14 (largest number ≤ 15)

Example 2:
Input:
arr = [2, 3, 5, 9, 14, 16, 18]
target = 1
Output:
-1 (No element ≤ 1)

 */