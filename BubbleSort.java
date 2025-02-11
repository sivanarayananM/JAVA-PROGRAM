import java.util.Arrays;

public class BubbleSort  {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,21,3};
        System.out.println(Arrays.toString(bubble(arr)));

    }
    public static int[] bubble(int[] arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j =1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }
}
