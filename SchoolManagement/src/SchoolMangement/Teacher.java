package SchoolMangement;
import java.util.*;
class Teacher {
    private Map<String, String> cradits;
    private Map<String, String> studentCredits;
    public Map<String , Integer> studentgrade;

    public Teacher(Map<String, String> cradits, Map<String, String> studentCredits , Map<String , Integer> studentgrade) {
        this.cradits = cradits;
        this.studentCredits = studentCredits;
        this.studentgrade = studentgrade;
    }

    public void teacherlogin(String username, String password) {
        if (cradits.containsKey(username) && cradits.get(username).equals(password)) {
            System.out.println("Teacher login... success");
            Teacherdetails teadetails = new Teacherdetails(studentCredits , studentgrade);
            teadetails.displayOptions();
        } else {
            System.out.println("Teacher not found");
        }
    }
}