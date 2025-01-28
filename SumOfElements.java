public class SumOfElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int ans=sum(arr);
        System.out.println("The sum of the element of array is "+ans);

    }
    public static int sum(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];         //Addig the element of the array
        }
        return total;
    }
}
