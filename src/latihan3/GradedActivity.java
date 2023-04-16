package latihan3;

public class GradedActivity {
    double score;
    String name;

    public void gradedActivity() {
        System.out.println("Nilai : " + score);
        System.out.println("Nama : " + name);
    }

    public void gradedActivity(String n) {
        this.name = n;
    }

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
    
}
