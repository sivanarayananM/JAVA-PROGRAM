public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,13,18,23,34,45};
        int target=25;
        System.out.println(ceiling(arr,target));
    }

    public static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length;
        for(int i=start;i<end;i++){
            int mid=(start+(end-start)/2);
            if(arr[mid]>=target){
                return arr[mid];
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}

/*

Example 1:
Input:
arr = [2, 3, 5, 9, 14, 16, 18]
target = 15
Output:
16 (smallest number ≥ 15)

Example 2:
Input:
arr = [2, 3, 5, 9, 14, 16, 18]
target = 20
Output:
-1 (No element ≥ 20)

 */