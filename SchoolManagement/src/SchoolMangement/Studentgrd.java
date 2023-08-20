package SchoolMangement;
import java.util.*;


class Studentgrd{
    Map<String , Integer> studentgrade;

    public  Studentgrd( Map<String , Integer> studentgrade){

        this.studentgrade = studentgrade;

    }

    public void studentgrades(String name){

        System.out.println("The Student name is : " + name);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + name + "Student grade : ");
        Integer grade =  sc.nextInt();

        studentgrade.put(name, grade);

    }

    public void allstudentsgrade(){

        
       for(Map.Entry<String , Integer> stu : studentgrade.entrySet()){
          System.out.println(" name is : " + stu.getKey());
        System.out.println(" grade is : " + stu.getValue());
          System.out.println("-----------------");
           
        }

    }
}

