import java.util.Scanner;

public class strsplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String input = scanner.nextLine();
        scanner.close();

        String numbers = "";
        String alphabets = "";
        String specialSymbols = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                numbers += ch;
            } else if (Character.isLetter(ch)) {
                alphabets += ch;
            } else {
                specialSymbols += ch;
            }
        }

        System.out.println("numbers = \"" + numbers + "\"");
        System.out.println("alphabets = \"" + alphabets + "\"");
        System.out.println("specialSymbols = \"" + specialSymbols + "\"");
    }
}
