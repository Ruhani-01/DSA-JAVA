public class Student {
    public static class myStudent {
        int marks[] = new int[3];

        // Default constructor
        myStudent() {
            // Initialize marks array if needed
        }

        // Constructor to perform a shallow copy of the marks array
        myStudent(myStudent S) {
            this.marks = S.marks;  // Shallow copy: both objects share the same marks array
        }

        void print() {
            for(int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }
        }
    }

    public static void main(String[] args) {
        myStudent s1 = new myStudent();
        s1.marks[0] = 65;
        s1.marks[1] = 85;
        s1.marks[2] = 83;

        // Creating a new myStudent instance by shallow copying s1
        myStudent s2 = new myStudent(s1);

        // Printing marks of s1
        System.out.println("Marks of s1:");
        s1.print();

        // Printing marks of s2
        System.out.println("Marks of s2:");
        s2.print();

        // Modify s2's marks and see the effect on s1
        s2.marks[0] = 90;

        System.out.println("After modifying s2:");
        System.out.println("Marks of s1:");
        s1.print();
        System.out.println("Marks of s2:");
        s2.print();
    }
}
