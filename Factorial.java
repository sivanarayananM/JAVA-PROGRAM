import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=obj.nextInt();
        int ans=factorial(number);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
       return n*factorial(n-1);  //Using Recursion to find factorial
    }
}
