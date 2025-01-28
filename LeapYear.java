import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year");
    int year=obj.nextInt();
    yearcheck(year);
}
public static void yearcheck(int year){

        if(year%100==0 && year%400==0){     //Check for century year
            System.out.println(year+" is Leap Year");
        }
        else if(year%4==0 && year%100!=0){  //Check for normal year
            System.out.println(year+" is Leap Year");
        }
        else{
            System.out.println(year+" is not a Leap Year");

        }

}


}
