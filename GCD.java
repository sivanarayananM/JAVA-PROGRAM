public class GCD {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        System.out.println(gcd(num1,num2));
    }

    public static int gcd(int num1,int num2){
        int large=0;
        if(num1>num2){
            large=num1;
        }else{
            large=num2;
        }
        for (int i = large/2; i >0 ; i--) {
            if(num1%i==0 && num2%i==0){      //Greatest common divisor for two numbers
                return i;
            }
        }
        return 0;
    }
}