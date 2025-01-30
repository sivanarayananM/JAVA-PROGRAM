import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int number=15;
        System.out.println(Arrays.toString(check(number)));

    }
    public static String[] check(int number){
        String[] arr=new String[number];
        for (int i = 1; i <=number ; i++) {
            if(i%15==0){       //If divisible by 15 print FizzBuzz
                arr[i-1]="FizzBuzz";
            }
            else if(i%3==0){  //If divisible by 3 print Fizz
                arr[i-1]="Fizz";
            }
            else if(i%5==0){  //If divisible by 5 print Buzz
                arr[i-1]="Buzz";
            }
            else{
                arr[i-1]= String.valueOf(i); //Otherwise print the number
            }
        }
        return arr;
    }
}


/*
Example 1:
Input: n = 3
Output: ["1","2","Fizz"]
Example 2:
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:
Input: n = 15
Output:
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */