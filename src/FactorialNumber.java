public class FactorialNumber {

    public static void main(String[] args) {
        int i = 5;
        int fact = 1;
        for (int j = 1; j <= i; j++) {
            fact = fact * j;
        }
        System.out.println(fact);
    }

}
