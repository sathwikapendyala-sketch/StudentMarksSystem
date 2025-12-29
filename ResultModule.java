import java.util.Scanner;

public class ResultModule {
    public String calculateGrade(double avg) {
    if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }
    public void displayResult(StudentModule s, MarksModule m) {
    double avg = m.averageMarks();
    String grade = calculateGrade(avg);
    System.out.println("\n--- Final Result ---");
    s.displayStudent();
    m.displayMarks();
    System.out.println("Average: " + avg + ", Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Math Marks: ");
        int math = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();
        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();
        StudentModule student = new StudentModule(id, name);
        MarksModule marks = new MarksModule(math, science, english);
        ResultModule result = new ResultModule();
        result.displayResult(student, marks);
        sc.close();
    }
}