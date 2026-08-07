package introducaopoo.application;

import introducaopoo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter your tree grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        System.out.println(student.result());
        if (student.finalGrade() < 60) {
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());

            sc.close();
        }
    }
}