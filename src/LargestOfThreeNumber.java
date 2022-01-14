public class LargestOfThreeNumber {

    public static void main(String[] args) {
        int num = largestOfThreeNumbers(3, 9, 7);
        System.out.println(num);

    }

    // Write a method that returns the largest of three numbers.
    public static int largestOfThreeNumbers(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }

    // Write a method that returns the smallest of three numbers.
    public static int smallestOfThreeNumbers(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static void evenNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void oddNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfNaturalNumber() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void largestElementInArray() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println(largest);
    }

    public static void smallestElementInArray() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
    // Write a method that returns the second largest number in an array.

}
