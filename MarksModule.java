public class MarksModule {
    private final int math;
    private final int science;
    private final int english;

    /**
     * Construct MarksModule; marks must be between 0 and 100 inclusive.
     * @throws IllegalArgumentException if any mark is out of range
     */
    public MarksModule(int math, int science, int english) {
        validateMark(math);
        validateMark(science);
        validateMark(english);
        this.math = math;
        this.science = science;
        this.english = english;
    }

    private void validateMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100. Invalid: " + mark);
        }
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getEnglish() {
        return english;
    }

    public int totalMarks() {
        return math + science + english;
    }

    public double averageMarks() {
        return totalMarks() / 3.0;
    }

    /**
     * Return a printable representation (useful in logs/tests).
     */
    @Override
    public String toString() {
        return "Marks → Math:" + math + ", Science:" + science + ", English:" + english;
    }

    /**
     * Print marks to stdout (kept for backward compatibility; not used in unit tests).
     */
    public void displayMarks() {
        System.out.println(toString());
    }
}

