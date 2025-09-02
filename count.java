import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        System.out.print("Enter the unit digit k: ");
        int k = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            int lastDigit = i % 10; 
            if (lastDigit == k) {
                count++; 
            }
        }
        System.out.println("Count of numbers ending with " + k + " is: " + count);
    }
}
