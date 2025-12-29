import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter marks (Math, Science, English): ");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();

        // Create objects of each module
        StudentModule s = new StudentModule(id, name);
        MarksModule m = new MarksModule(math, sci, eng);
        ResultModule r = new ResultModule();

        // Display integrated output
        r.displayResult(s, m);

        sc.close();
    }
}

