public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,3,2,1};
        String s=checkPalindrome(arr);
        System.out.println("The given array is "+s);
    }
    public static String checkPalindrome(int[] arr){
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[arr.length-i-1];  //Reversing the array
        }int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ans[i]){        //Comparing the original and reversed array
                count++;              //Increasing count if original array element and reversed array element are equal
            }
        }
        if(count==arr.length){  //If the array length is equal to count then the array is palindrome
            return "palindrome";
        }
        return "not a palindrome";
    }
}
