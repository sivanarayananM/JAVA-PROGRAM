public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,34,56,67,78,89,90};
        int first=0;
        int last=arr.length-1;
        int mid=(first+last)/2; //To find the middle element
        int target=89;
        int ans=1;

        for (int i = 0; i < last; i++) {
            mid=(first+last)/2;
            if(arr[mid]==target){  //checks the middle element is equal to target
                ans=mid;
                break;
            }else if(target>arr[mid]){ //if the target is greater than the middle element then search right side
                first=mid+1;
            }else if(target<arr[mid]){  //if the target is lesser than the middle element then search left side
                last=mid-1;
            }
        }
        System.out.println(ans);
    }
}
