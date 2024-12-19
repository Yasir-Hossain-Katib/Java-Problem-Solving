public class OrderHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int n = cgpa.length;


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cgpa[j] < cgpa[j + 1]) {

                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }


        System.out.println("CGPA scores sorted in highest order:");
        for (double score : cgpa) {
            System.out.println(score);
        }
    }
}
