import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 4 digit number : ");
        int number=obj.nextInt();
        int sum=0;
        while(number!=0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println("Sum of digit : "+sum);
    }
}
