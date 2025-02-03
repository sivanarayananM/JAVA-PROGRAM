import java.util.Random;

public class StupidPassword {
    public static void main(String[] args) {
        Random ran=new Random();
        int n=0;
        int a=ran.nextInt(9);  //Generating Random integers
        int b=ran.nextInt(9);
        if(a>b){
            n=a;
        }n=b;
        int c=ran.nextInt(n+1,10);
        char c1=(char)(a+'0');             //converting int to char
        char c2=(char)(b+'0');
        char c3=(char)(ran.nextInt(26)+'a'); //Generating Random characters
        char c4=(char)(ran.nextInt(26)+'a');
        char c5=(char)(c+'0');

        System.out.println("Stupid Password is : "+c1+c2+c3+c4+c5);
    }
}
