import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter taxi number : ");
        int a=obj.nextInt();
        System.out.println("Enter distance travelled : ");
        int n=obj.nextInt();
        System.out.println("Taxi No : "+a);
        System.out.println("Distance covered : "+n);
        int ans=0;
        if(n<=5)
            ans=n*20;
        else if(n<=15) {
            n = n-5;
            ans = 100 +n*10;
        }else if(n<=25){
            n=n-15;
            ans = 100+100 +n*8;
        }else{
            n=n-25;
            ans=100+100+80+n*5;}
        System.out.println("Amount : "+ans);
    }
}
