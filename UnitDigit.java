import java.util.Scanner;
public class UnitDigit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=obj.nextInt();
        int unitdigit=number%10;

        System.out.println("Unit Digit is : "+unitdigit);
    }
}
