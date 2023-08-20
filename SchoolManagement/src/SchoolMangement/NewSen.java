package SchoolMangement;

import java.util.*;


class NewSen {
    public static void main(String[] args) {

        Map<String, String> Teachercradits = new HashMap<>();
        Map<String, String> Studentcradits = new HashMap<>();
        Map<String , Integer> studentgrade = new HashMap<>();
        Map<String , String> cousleist = new HashMap<>();
        Teachercradits.put("Guna", "guna");
        Teachercradits.put("Gunas", "gunas"); 

        Studentcradits.put("vasu", "vasu");
        Studentcradits.put("vasus", "vasus");

        cousleist.put("vasu", "Full Stack in java");

        studentgrade.put("vasssu", 46);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome Angel Metric hr Board");
            System.out.println("Teacher Login Press 1 ");
            System.out.println("Student Login Press 2: ");
            System.out.println("For Exit Press 4: ");
            System.out.println("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    teacherlogin(Teachercradits, Studentcradits , studentgrade);
                    break;
                }
                case 2: {
                    studentlogin(Studentcradits , studentgrade ,cousleist);
                    break;
                }
                case 4: {
                    System.out.println("Exited from the App.");
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("You entered a wrong choice number...");
                }
            }
        }
    }

    public static void teacherlogin(Map<String, String> Teachercradits, Map<String, String> Studentcradits,Map<String , Integer> studentgrade) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String username = scanner.next();

        System.out.println("Enter the password: ");
        String password = scanner.next();

        Teacher teacher = new Teacher(Teachercradits, Studentcradits , studentgrade);
        teacher.teacherlogin(username, password);
    }

    public static void studentlogin(Map<String, String> Studentcradits , Map<String , Integer> studentgrade ,Map<String , String> cousleist) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student username: ");
        String username = sc.next();

        System.out.println("Enter the password: ");
        String password = sc.next();

        Student student = new Student(Studentcradits , studentgrade , cousleist);
        student.studentlogin(username, password);
    }
}