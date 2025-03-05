import java.util.Scanner;
public class Gst {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the price : ");
        int price=obj.nextInt();
        double cgst=(price/100.0)*9;
        double sgst=(price/100.0)*11;
        System.out.println("CGST : "+cgst);
        System.out.println("SGST : "+sgst);
        System.out.println("Total : "+(cgst+sgst+price));
    }
}
