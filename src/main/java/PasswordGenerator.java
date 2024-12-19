import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("Generated Password: " + generatePassword());
    }

    public static String generatePassword() {
        Random random = new Random();


        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;


        char upperCase = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
        char lowerCase = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        char digit = digits.charAt(random.nextInt(digits.length()));
        char specialChar = specialCharacters.charAt(random.nextInt(specialCharacters.length()));


        StringBuilder password = new StringBuilder();
        password.append(upperCase)
                .append(lowerCase)
                .append(digit)
                .append(specialChar);


        for (int i = 4; i < 8; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }


        return shuffleString(password.toString());
    }


    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}
