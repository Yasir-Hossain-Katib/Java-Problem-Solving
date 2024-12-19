import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - i - 1; j++) {
                if (cgpa[j] > cgpa[j + 1]) {
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double target = scanner.nextDouble();

        int left = 0, right = cgpa.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == target) {
                found = true;
                break;
            } else if (cgpa[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        if (found) {
            System.out.println("CGPA " + target + " is present in the list.");
        } else {
            System.out.println("CGPA " + target + " is not present in the list.");
        }
    }
}
