package Problem_2;
public class Student {

    // Private data members
    private String name;
    private int[] marks;

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {

        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}