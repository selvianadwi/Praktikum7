package latihan3;

public class PassFailActivity extends GradedActivity {
    double minimumPassingScore;
    
    public PassFailActivity(double min) {
        minimumPassingScore = min;
    }
    
    public char getGrade() {
        char grade;
        if (getScore() >= minimumPassingScore) {
            grade = 'P';
        } else {
            grade = 'F';
        }
        
        return grade;
    }
}
