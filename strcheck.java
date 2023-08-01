import java.util.Scanner;

class strcheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number= ");
        String number = input.nextLine();
        // closes the scanner
        input.close();
        try {
            // checking valid integer using parseInt()
            // method
            Integer.parseInt(number);
            System.out.println(
                    " Given string is a number");
        } catch (NumberFormatException e) {
            System.out.println(
                    "Given string is not a number");
        }

    }
}
