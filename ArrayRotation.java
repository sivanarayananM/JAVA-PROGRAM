// Program to rotate an array to the right by one position
public class ArrayRotation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        printArray(numbers);

        rotateArray(numbers);

        System.out.println("Array after rotation: ");
        printArray(numbers);
    }

    public static void rotateArray(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
