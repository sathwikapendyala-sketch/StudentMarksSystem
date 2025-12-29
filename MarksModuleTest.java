import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MarksModule
 */
public class MarksModuleTest {

    @Test
    @DisplayName("Total and average for valid marks")
    void testTotalAndAverage() {
        MarksModule m = new MarksModule(80, 70, 90);
        assertEquals(240, m.totalMarks());
        assertEquals(80.0, m.averageMarks(), 1e-9);
        assertEquals("Marks → Math:80, Science:70, English:90", m.toString());
    }

    @Test
    @DisplayName("Zero marks handled")
    void testZeroMarks() {
        MarksModule m = new MarksModule(0, 0, 0);
        assertEquals(0, m.totalMarks());
        assertEquals(0.0, m.averageMarks(), 1e-9);
    }

    @Test
    @DisplayName("Invalid marks (negative) throw")
    void testInvalidNegative() {
        assertThrows(IllegalArgumentException.class, () -> new MarksModule(-1, 50, 50));
    }

    @Test
    @DisplayName("Invalid marks (>100) throw")
    void testInvalidTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> new MarksModule(101, 50, 50));
    }
}

