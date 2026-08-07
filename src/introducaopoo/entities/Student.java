package introducaopoo.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String result() {
        if (finalGrade() >= 60) {
            return "PASS";
        } else {
            return "FAILED";
        }
    }

    public double missingPoints() {
        return 60 - finalGrade();
    }
}
