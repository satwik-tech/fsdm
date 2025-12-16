public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course c1 = new Course("CS101", "OOP");
        Course c2 = new Course("CS102", "OS");
        Course c3 = new Course("CS103", "DBMS");

        System.out.print("Enter student name: ");
        sc.nextLine(); // Fix for Scanner bug after nextInt(), optional if not using nextInt() before
        String name = sc.nextLine();

        Student s = new Student(name);

        while (true) {
            System.out.println("\n1. Enroll OOP");
            System.out.println("2. Enroll OS");
            System.out.println("3. Enroll DBMS");
            System.out.println("4. Show Courses");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) s.enroll(c1);
            else if (ch == 2) s.enroll(c2);
            else if (ch == 3) s.enroll(c3);
            else if (ch == 4) s.showCourses();
            else if (ch == 5) break;
            else System.out.println("Invalid option.");
        }

        sc.close();
    }
}
