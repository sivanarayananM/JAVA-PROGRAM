import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9} ;
        int element=3;
        int amm[]=remove(arr,element);
        System.out.println(Arrays.toString(amm));
    }
    public static int[] remove(int[] arr,int element){
        int[] ans=new int[arr.length-1];
     int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=element){     //If array value not equal to the element to remove
                ans[j]=arr[i];      //then add the element to the new array
                j++;
            }
        }
        return ans;
    }
}
