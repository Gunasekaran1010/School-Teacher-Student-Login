package SchoolMangement;
import java.util.*;

class StudentOptions {
    Map<String , Integer> studentgrade;
    private Map<String, String> credits;
    Map<String , String> cousleist ;

    public StudentOptions(Map<String, String> credits ,Map<String , Integer> studentgrade, Map<String , String> cousleist ){
        this.studentgrade = studentgrade;
        this.credits = credits;
        this.cousleist = cousleist;
        
    }
    public void displayOptions(String username) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Options:");
            System.out.println("1. View Courses");
            System.out.println("2. View Grades");
            System.out.println("3. Logout");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Viewing courses...");
                    courselist(username,cousleist);
                    break;
                case 2:
                    System.out.println("Viewing grades...");
                    mygrade(username,credits,studentgrade);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void courselist(String username,Map<String , String> cousleist){

        if(cousleist.containsKey(username)){
            System.out.println("student name is : " + username);
            System.out.println("course Name is : " + cousleist.get(username));
        }
        else{
            System.out.println("Not Selected");
        }

    }

    public void mygrade(String usname,Map<String, String> credits,Map<String , Integer> studentgrade ) {
        if(studentgrade.containsKey(usname)){
            System.out.println("Student name is : " + usname);
            System.out.println("Grade is : " + studentgrade.get(usname) );
        }
        else{
            System.out.println("No Grade");
        }
    }
}