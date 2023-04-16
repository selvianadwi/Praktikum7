package latihan3;

public class FinalExam extends GradedActivity {
    int numberOfQuestions;
    int numMissed;
    double pointsPerQuestion;
    

    public FinalExam(int questions, int missed) {
        numberOfQuestions = questions;
        numMissed = missed;
        pointsPerQuestion = 100.0 / numberOfQuestions;
        double numericScore = 100.0 - (numMissed * pointsPerQuestion);
        setScore(numericScore);
    }

    public double getPointsPerQuestion() {
        return pointsPerQuestion;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
