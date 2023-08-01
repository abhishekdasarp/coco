import java.util.Scanner;

public class numswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        swapNumbers(a, b);

       
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }

    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
