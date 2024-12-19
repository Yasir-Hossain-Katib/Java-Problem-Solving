public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;


        for (double score : cgpa) {
            if (score > highest) {
                highest = score;
            }
        }


        for (double score : cgpa) {
            if (score > secondHighest && score < highest) {
                secondHighest = score;
            }
        }

        System.out.println("The second highest CGPA is: " + secondHighest);
    }
}
