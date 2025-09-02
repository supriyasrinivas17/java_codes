public class Main {
    public static int calculateResult(int n, int m) {
        if (n > m) {
            return (n * m) - (n - m);
        } else {
            return (m % n) - (m + n);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 8;

        int result = calculateResult(n, m);
        System.out.println("Result: " + result);
    }
}
