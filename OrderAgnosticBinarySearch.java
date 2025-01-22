public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={90,89,78,67,56,45,34,23,12,9,8,7,6,4,2};
        int target=45;
      int ans=Search(arr,target);
        System.out.println(ans);
    }


   public static int Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        boolean isAscending=arr[start]<arr[end]; //Checking for the Array is Ascending order or not
    while(start<=end){
        int mid=(start+end)/2;
        if(isAscending){  //This part execute for the Ascending order array to find target
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }
        }else{                //This part execute for the Descending order array to find target
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                start=mid+1;
            }else if(target>arr[mid]){
                end=mid-1;
            }
        }
    }
    return -1;  //If the target not found return -1
    }
}
