import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ResultModuleTest {
    @Test
    public void testCalculateGrade_APlus() {
        ResultModule r = new ResultModule();
        assertEquals("A+", r.calculateGrade(95.0), "Grade should be A+ for 95 marks");
    }

    @Test
    public void testCalculateGrade_A() {
        ResultModule r = new ResultModule();
        assertEquals("A", r.calculateGrade(80.0), "Grade should be A for 80 marks");
    }

    @Test
    public void testCalculateGrade_B() {
        ResultModule r = new ResultModule();
        assertEquals("B", r.calculateGrade(65.0), "Grade should be B for 65 marks");
    }

    @Test
    public void testCalculateGrade_C() {
        ResultModule r = new ResultModule();
        assertEquals("C", r.calculateGrade(55.0), "Grade should be C for 55 marks");
    }

    @Test
    public void testCalculateGrade_Fail() {
        ResultModule r = new ResultModule();
        assertEquals("Fail", r.calculateGrade(40.0), "Grade should be Fail for 40 marks");
    }

    @Test
    public void testBoundaryGrades() {
        ResultModule r = new ResultModule();
        assertAll(
            () -> assertEquals("A+", r.calculateGrade(90.0), "90 should be A+"),
            () -> assertEquals("A", r.calculateGrade(75.0), "75 should be A"),
            () -> assertEquals("B", r.calculateGrade(60.0), "60 should be B"),
            () -> assertEquals("C", r.calculateGrade(50.0), "50 should be C"),
            () -> assertEquals("Fail", r.calculateGrade(49.9), "Below 50 should be Fail")
        );
    }

    // 🧩 Manual main method for console execution
    public static void main(String[] args) {
        ResultModule r = new ResultModule();
        System.out.println("Grade (95): " + r.calculateGrade(95));
        System.out.println("Grade (75): " + r.calculateGrade(75));
        System.out.println("Grade (45): " + r.calculateGrade(45));
    }
}


