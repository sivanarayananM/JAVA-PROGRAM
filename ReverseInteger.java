public class ReverseInteger {
    public static void main(String[] args) {
        int number=12345;
        System.out.println("Original number");
        System.out.println(number);
        System.out.println("Reversed number");
        System.out.println(reverse(number));
    }

    public static int reverse(int number){
        int reverse=0;
        for (int i = 0; i < 5; i++) {
            int temp=number%10;
            reverse=reverse*10+temp; //It is used to reverse an integer digit by digit
            number=number/10;

    }
       return reverse;
}}
