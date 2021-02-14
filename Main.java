import java.util.Scanner;
import packages.Student;

    
public class Main {
    public static void main(String[] args) {

        System.out.println("----- welcome to INTTIC RATE CALCULATOR -----");
        Student s1 = createNewStudent();
        printStudentInfo(s1);
}



public static void printStudentInfo(Student s) {
    final String firstName = s.getFirstName();
    final String lastName = s.getLastName();
    final int level = s.getLevel();
    final float finalRate = s.getFinalRate();

        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Level: IGE" + level);
        System.out.println("Final Rate: " + finalRate);
}


public static Student createNewStudent() {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("please enter your :\nfirstName : ");
    final String firstName = sc.nextLine();
    
    System.out.println("lastName : ");
    final String lastName = sc.nextLine();

    System.out.println("level : ");
    final int level = sc.nextInt();

    sc.close();

    return  new Student(firstName,lastName,level);   
}


}