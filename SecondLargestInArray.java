// Program to find the second largest number in an array
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second Largest Number: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
