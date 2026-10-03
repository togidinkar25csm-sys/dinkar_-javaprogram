package crits;

import java.util.Arrays;

class Student {
    private int rollNumber;
    private String name;
    private int[] marks; // marks in 5 subjects

    // Constructor to initialize student details
    Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name.trim(); // remove extra spaces
        this.marks = marks;
    }

    // Calculate total marks
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Calculate average marks
    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Find highest marks using Math.max()
    public int findHighest() {
        int highest = marks[0];
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }
        return highest;
    }

    // Find lowest marks using Math.min()
    public int findLowest() {
        int lowest = marks[0];
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }
        return lowest;
    }

    // Calculate percentage (assuming each subject is out of 100)
    public double calculatePercentage() {
        double percentage = (calculateTotal() / (double) (marks.length * 100)) * 100;
        return Math.round(percentage * 100.0) / 100.0; // round to 2 decimal places
    }

    // Determine grade based on percentage
    public String getGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    // Determine pass/fail
    public boolean isPassed() {
        return calculatePercentage() >= 50;
    }

    // Performance remark based on grade
    public String getRemark() {
        String grade = getGrade();
        switch (grade) {
            case "A+": return "Outstanding Performance!";
            case "A":  return "Excellent Performance!";
            case "B":  return "Very Good Performance!";
            case "C":  return "Good, but can improve.";
            case "D":  return "Average, needs more effort.";
            default:   return "Needs serious improvement.";
        }
    }

    // Display complete student performance report
    public void displayDetails() {
        System.out.println("===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Student Name  : " + name.toUpperCase());
        System.out.println("Name Length   : " + name.length() + " characters");
        System.out.println("Marks         : " + Arrays.toString(marks));
        System.out.println("Total Marks   : " + calculateTotal());
        System.out.printf("Average Marks : %.2f%n", calculateAverage());
        System.out.println("Highest Marks : " + findHighest());
        System.out.println("Lowest Marks  : " + findLowest());
        System.out.printf("Percentage    : %.2f%%%n", calculatePercentage());
        System.out.println("Grade         : " + getGrade());
        System.out.println("Result        : " + (isPassed() ? "PASS" : "FAIL"));
        System.out.println("Remark        : " + getRemark());
    }
}


// Main class
public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {

        int[] subjectMarks = {88, 76, 95, 68, 82};

        Student student = new Student(101, "  Ananya Rao  ", subjectMarks);

        student.displayDetails();
    }
}