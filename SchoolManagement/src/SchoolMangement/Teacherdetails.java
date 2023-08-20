package SchoolMangement;
import java.util.*;


class Teacherdetails {
    private Map<String, String> studentCredits;
      public Map<String , Integer> studentgrade;

    public Teacherdetails(Map<String, String> studentCredits ,Map<String , Integer> studentgrade) {
        this.studentCredits = studentCredits;
        this.studentgrade = studentgrade;
    }

    public void displayOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Teacher Options:");
            System.out.println("1. View Students");
            System.out.println("2. Manage Grades");
            System.out.println("4. Logout");
            System.out.println("5. All students grade");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Viewing students:");
                    displayStudentNames();
                    break;
                case 2:
                    System.out.println("Managing grades...");
                    studentsgradeenter();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;

                case 5:{
                    System.out.println("To See all Students Grades :");
                    Studentgrd stugrd = new Studentgrd(studentgrade);
                    stugrd.allstudentsgrade();
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayStudentNames() {
        System.out.println("List of Students:");
        for (String studentName : studentCredits.keySet()) {
            System.out.println(studentName);
        }
    }

    public void studentsgradeenter(){

        System.out.println("Enter the Student Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();


        if(studentCredits.containsKey(name)){

            Studentgrd stugrd = new Studentgrd(studentgrade);
            stugrd.studentgrades(name);
        }

    }
}