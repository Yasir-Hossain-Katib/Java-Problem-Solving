import java.util.Scanner;

public class VowelRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();


        String result = input.replaceAll("[AEIOUaeiou]", "");


        System.out.println("Output: " + result);
    }
}
