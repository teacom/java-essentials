public class StringDemo {
    public static void main(String[] args) {
        // String palindrome = "Dot saw I was Tod";
        // int len = palindrome.length();
        // System.out.println(len);
        // char[] tempCharArray = new char[len];
        // char[] charArray = new char[len];

        // // put original string in an
        // // array of chars
        // for (int i = 0; i < len; i++) {
        // tempCharArray[i] = palindrome.charAt(i);
        // System.out.print(tempCharArray[i]);
        // }

        // // reverse array of chars
        // for (int j = 0; j < len; j++) {
        // charArray[j] = tempCharArray[len - 1 - j];
        // System.out.print(charArray[j]);
        // }

        // String reversePalindrome = new String(charArray);
        // System.out.println(reversePalindrome);

        // Prime Number Program in Java
        // int n = 8;
        // boolean isPrime = true;
        // for (int i = 2; i <= n / 2; i++) {
        // if (n % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println(n + " is a prime number");
        // } else {
        // System.out.println(n + " is not a prime number");
        // }

        armstrongNumber(153);
        palindrome(1221);
        fabonacci(10);
        String s = reverse("chandan is a good guy");
        System.out.println(s);

        swap(10, 20);

    }

    private static void armstrongNumber(int i) {

        int sum = 0;
        int temp = i;
        while (temp > 0) {
            int r = temp % 10;
            sum += (r * r * r);
            temp /= 10;
        }
        if (sum == i) {
            System.out.println(i + " is an Armstrong number");
        } else {
            System.out.println(i + " is not an Armstrong number");
        }
    }

    private static void palindrome(int i) {
        int temp = i;
        int sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum = (sum * 10) + r;
            temp /= 10;
        }
        if (sum == i) {
            System.out.println(i + " is a palindrome number");
        } else {
            System.out.println(i + " is not a palindrome number");
        }
    }

    private static void fabonacci(int i) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int j = 0; j < i; j++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }

    // reverse the string
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;

    }

    // Right Triangle Star Pattern Program in Java

    // swap two numbers without using third variable
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}