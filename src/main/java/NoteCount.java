import java.util.Scanner;

public class NoteCount {
    public static void main(String[] args) {

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        System.out.println("Output:");

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note;
                System.out.println(note + " " + count);
            }
        }
    }
}
