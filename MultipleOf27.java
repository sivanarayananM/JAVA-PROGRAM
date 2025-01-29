import java.util.Scanner;

public class MultipleOf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 27 == 0) {      //Check the number is divisible by 27
            System.out.println(num+" is multiple of 27");
        } else {
            System.out.println(num+" is not a multiple of 27");
        }

    }
}
