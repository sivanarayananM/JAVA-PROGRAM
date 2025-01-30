public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};

        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result^arr[i];    // XOR cancels out duplicate numbers
        }
        return result;
    }
}


/*
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1

 */