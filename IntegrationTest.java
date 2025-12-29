import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest 
{

    @Test
    void testStudentModule() 
    {
        StudentModule s = new StudentModule(1, "Alex");
        assertEquals(1, s.getStudentId());
        assertEquals("Alex", s.getStudentName());
    }

    @Test
    void testMarksModule() 
    {
        MarksModule m = new MarksModule(80, 70, 90);
        assertEquals(240, m.totalMarks());
        assertEquals(80.0, m.averageMarks(), 0.01);
    }

    @Test
    void testResultModule() 
    {
        ResultModule r = new ResultModule();
        assertEquals("A+", r.calculateGrade(95));
        assertEquals("A", r.calculateGrade(80));
        assertEquals("Fail", r.calculateGrade(40));
    }

    @Test
    void testIntegrationFlow() 
    {
        StudentModule s = new StudentModule(1, "Alex");
        MarksModule m = new MarksModule(80, 70, 90);
        ResultModule r = new ResultModule();

        double avg = m.averageMarks();
        String grade = r.calculateGrade(avg);

        assertEquals(80.0, avg, 0.01);
        assertEquals("A", grade);
    }
}



