import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentModuleTest {

    @Test
    public void testStudentId() {
        StudentModule s = new StudentModule(101, "Surabhi");
        assertEquals(101, s.getStudentId(), "Student ID should match the constructor value");
    }

    @Test
    public void testStudentName() {
        StudentModule s = new StudentModule(101, "Surabhi");
        assertEquals("Surabhi", s.getStudentName(), "Student name should match the constructor value");
    }

    @Test
    public void testDisplayStudent() {
        StudentModule s = new StudentModule(102, "Ravi");
        assertAll(
            () -> assertEquals(102, s.getStudentId()),
            () -> assertEquals("Ravi", s.getStudentName())
        );
    }
}
