public class PrimeNumber {
    public static void main(String[] args) {
        int num=37;
        if(check(num)){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not a prime number");

        }
    }

    public static boolean check(int num){
        if(num<2){               //This condition return false for negative numbers and 1
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num%i==0){           //If the given number is divisible by any number
                return false;       //other than 1 and given number return false
            }
        }
        return true;          //Otherwise it is a prime number
    }
}
