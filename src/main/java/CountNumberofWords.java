import java.util.Scanner;

public class CountNumberofWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();


        int wordCount = 0, charCount = 0, vowelCount = 0, consonantCount = 0;


        String[] words = input.split("\\s+");
        wordCount = words.length;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (ch != ' ') {
                charCount++;


                if (isVowel(ch)) {
                    vowelCount++;
                } else if (Character.isAlphabetic(ch)) {
                    consonantCount++;
                }
            }
        }


        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }


    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
