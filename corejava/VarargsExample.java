public class VarargsExample {

    // Regular parameters come first; Varargs must be last.
    public static void printStudentScores(String studentName, String subject, int... scores) {

        System.out.print(studentName + " - " + subject + " scores: ");

        // Check if any scores were passed
        if (scores.length == 0) {
            System.out.println("No scores recorded yet.");
            return;
        }

        // Iterate through the Varargs array
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);

            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Multiple Varargs arguments
        printStudentScores("Alice", "Math", 95, 88, 92);

        // One Varargs argument
        printStudentScores("Bob", "Science", 78);

        // Zero Varargs arguments
        printStudentScores("Charlie", "History");
    }
}