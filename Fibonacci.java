public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int number=10;
        printFibonacciSeries(a,b,number);
    }
    public static void printFibonacciSeries(int a,int b,int number){
        System.out.print(a+" "+b);
        for (int i = 2; i <number ; i++) {
           int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
