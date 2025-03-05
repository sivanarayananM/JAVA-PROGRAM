import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 5 subject mark : ");
        int m1 = obj.nextInt();
        int m2 = obj.nextInt();
        int m3 = obj.nextInt();
        int m4 = obj.nextInt();
        int m5 = obj.nextInt();
        int aggregate=m1+m2+m3+m4+m5;
        double percentage=aggregate/5;
        System.out.println("Aggregate : "+aggregate);
        System.out.println("Percentage : "+percentage);
    }
}