import java.util.Scanner;
public class AbsoluteAddSub {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int value1=obj.nextInt();
        int value2=obj.nextInt();
        int[] ans=AddSub(value1,value2);
        System.out.println("Addition of 2 values: "+ans[0]);
        System.out.println("Subtraction of 2 values: "+ans[1]);

    }
    public static int[] AddSub(int value1,int value2){
        int add=value1+value2;
        if(add<0){           //If the value is negative
            add=add*-1;      //It is multiplied with -1 to make it positive
        }
        int sub=value1-value2;
        if(sub<0){
            sub=sub*-1;
        }
        return new int[] {add,sub};
    }
}
