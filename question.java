import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Even numbers: ");
        for(int num : numbers) {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for(int num : numbers) {
            if(num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
