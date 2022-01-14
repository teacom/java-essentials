public class Swapping {
    public static void main(String[] args) {
        swap(10, 20);

    }

    private static void swap(int i, int j) {
        System.out.println("Before swapping " + i + " " + j);
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("After swapping " + i + " " + j);
    }

}
