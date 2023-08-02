import java.util.Scanner;

public class evenoddcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = isEvenOrOdd(number);
        System.out.println("Given number is " + result);
        scanner.close();
    }

    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
