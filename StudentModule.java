public class StudentModule {
    private int studentId;
    private String studentName;

    public StudentModule(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId + ", Name: " + studentName);
    }

    // ✅ Add this if missing
    public static void main(String[] args) {
        StudentModule s1 = new StudentModule(1, "Surabhi");
        s1.displayStudent();
    }
}


