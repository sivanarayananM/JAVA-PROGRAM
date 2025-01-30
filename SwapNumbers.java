public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 52;
        System.out.println("Before swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("After swapping");
        swap(a,b);
    }
    public static void swap(int a,int b){
        a=a+b;           //Swap Two Numbers Without Using a Third Variable
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}