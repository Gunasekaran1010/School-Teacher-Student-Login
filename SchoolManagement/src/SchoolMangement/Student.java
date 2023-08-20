package SchoolMangement;
import java.util.*;

class Student {
    private Map<String, String> credits;
    Map<String , Integer> studentgrade;
    Map<String , String> cousleist ;
    

    public Student(Map<String, String> credits , Map<String , Integer> studentgrade,Map<String , String> cousleist ) {
        this.studentgrade = studentgrade;
        this.credits = credits;
        this.cousleist = cousleist;
    }

    public void studentlogin(String username, String password) {
        if (credits.containsKey(username) && credits.get(username).equals(password)) {
            StudentOptions stuotp = new StudentOptions(   credits , studentgrade , cousleist) ;
            stuotp.displayOptions(username);
        } else {
            System.out.println("Student not found");
        }
    }
}