/*
Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:
Input: num = 7
Output: false
 */

public class PerfectNumber {
    public static void main(String[] args) {
        int number=28;
        if(check(number)){
            System.out.println(number+" is perfect number");
        }else{
            System.out.println(number+" is not a perfect number");

        }}
    public static boolean check(int number){

        int ans=0;
        for (int i = 1; i <= number/2; i++) {
            if(number%i==0){
               ans=ans+i;       //Adding the divisors of the given number
            }
        }
        if(ans==number){      //If sum equals number
            return true;     //Then it is perfect number
        }
        return false;
    }
}

