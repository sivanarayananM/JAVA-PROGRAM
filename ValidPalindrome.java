public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String value=clean(s);
        System.out.println(value);
        if(palindrome(value)){
            System.out.println("The given String is palindrome");
        }else{
                System.out.println("The given String not a is palindrome");
        }
    }
    //Converting all uppercase letters into lowercase letters and
    //removing all non-alphanumeric characters

    public static String clean(String s){
        String clean=s.replaceAll("[^A-Za-z]","");
        return clean.toLowerCase();
    }
    public static boolean palindrome(String value){  //Find the given string is palindrome or not

     String reverse="";
        for (int i = value.length()-1; i>=0 ; i--) {
            reverse=reverse+value.charAt(i);
        }
        if(value.equals(reverse)){
            return true;
        }
        return false;
    }
}



/*
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */