import java.util.Scanner;

public class IPaddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an IP address: ");
        String ip = scanner.nextLine();
        scanner.close();


        if (isValidIP(ip)) {
            System.out.println("Output: Valid IP");
        } else {
            System.out.println("Output: Invalid IP");
        }
    }

    public static boolean isValidIP(String ip) {

        String regex = "([1-9][0-9]*)\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})";


        if (!ip.matches(regex)) {
            return false;
        }


        String[] parts = ip.split("\\.");
        for (String part : parts) {
            int value = Integer.parseInt(part);
            if (value < 0 || value > 255) {
                return false;
            }
        }

        return true;
    }
}
