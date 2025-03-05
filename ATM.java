import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of 100 rupees notes you want to withdraw : ");
        int hundread=obj.nextInt();
        System.out.println("Enter the number of 500 rupees notes you want to withdraw : ");
        int fivehundread=obj.nextInt();
        System.out.println("Enter the number of 1000 rupees notes you want to withdraw : ");
        int thousand=obj.nextInt();

        int total=(100*hundread)+(500*fivehundread)+(1000*thousand);
        System.out.println("Total amount withdrawn : "+total+" rupees");
    }
}
