package latihan3;

public class PassFailExam extends GradedActivity{
    int numberOfQuestions;
    double pointsQuestions;
    int numberMissed;

    public PassFailExam(int questions, int missed, double minPassing){
        numberOfQuestions = questions;
        numberMissed = missed;
        pointsQuestions = 100.0 / numberOfQuestions;
        double numericScore = 100.0 - (numberMissed * pointsQuestions);
        setScore(numericScore);
        char grade;
        if (getScore() >= minPassing) {
            grade = 'P';
        } else {
            grade = 'F';
        }
        System.out.println("Nilai : " + getScore());
        System.out.println("Grade : " + grade);
    }

    public double getPointsEach() {
        return pointsQuestions;
    }

    public int getNumMissed() {
        return numberMissed;
    }
}
