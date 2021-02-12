import packages.*;

import java.util.ArrayList;
import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        System.out.println("INTTIC Semester Rate");
        System.out.println("-------------------");
        Student s1 = newStudent();
        showStudentInfos(s1);
        Material m1 = new Material("SIBD", 4);
        float finaleRate = m1.claculateRate(17, 17, 17);
        System.out.println(finaleRate / m1.coeff);
    }

    static Scanner sc = new Scanner(System.in);


    public static Student newStudent() {
        System.out.println("Student Informations:");
        System.out.print("Enter FirstName: ");
        String firstNameInput = sc.next();
        System.out.print("Enter LastName: ");
        String lastNameInput = sc.next();
        System.out.print("Enter Level: ");
        int igeInput = sc.nextInt();  
        System.out.println("Successfully created!");

        Student student = new Student(firstNameInput, lastNameInput, igeInput);
        return student;
    }


    /*
    public static ArrayList<Student> addStudent(int lengthStudents) {
        ArrayList<Student> students = new ArrayList<>();
        int j = 1;
        while (j <= lengthStudents) {
            System.out.println("Student " + j + " Informations:");
            System.out.print("Enter FirstName: ");
            String firstNameInput = sc.next();
            System.out.print("Enter LastName: ");
            String lastNameInput = sc.next();
            System.out.print("Enter Level: ");
            int igeInput = sc.nextInt();  
            System.out.println("Successfully created!");
            students.add(new Student(firstNameInput, lastNameInput, igeInput));
            j++;
        }   
        return students;
    }
    */

    public static void showStudentInfos(Student student) {
        System.out.println("First name: " + student.firstName);
        System.out.println("Last name: " + student.lastName);
        System.out.println("Level: " + student.level);
        System.out.println("Semester rate: " + student.finalRate);
    }

    public static ArrayList<Material> addMaterial(int numOfMaterials) {
        ArrayList<Material> materials = new ArrayList<>();
        int j = 1;
        while (j <= numOfMaterials) {
            System.out.println("Material " + j + " Informations:");
            System.out.print("Enter Material name: ");
            String nameInput = sc.next();
            System.out.print("Enter Coff: ");
            int coeffInput = sc.nextInt();
            System.out.println("Successfully created!");
            materials.add(new Material(nameInput, coeffInput));
            j++;
        }   
        return materials;       
    }
}