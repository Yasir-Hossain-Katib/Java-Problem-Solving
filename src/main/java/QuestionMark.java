public class QuestionMark {
    public static void main(String[] args) {
        int totalMarks = 100;
        int fiveMarksQuestions = 10;
        int tenMarksQuestions = (totalMarks - (fiveMarksQuestions * 5)) / 10;

        System.out.println("5 marks question is " + fiveMarksQuestions);
        System.out.println("10 marks question is " + tenMarksQuestions);
    }
}
