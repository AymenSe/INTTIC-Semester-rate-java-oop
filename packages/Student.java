package packages;

public class Student {

    // Private Attributs
    public String firstName;
    public String lastName;
    public int level;
    public float finalRate = 0;

    // Constructor
    public Student(String firstName, String lastName, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
    }

    // Methods
    public void getInfos() {
        System.out.println("Full Name: " + this.firstName + " " + this.lastName);
        System.out.println("Level: IGE" + this.level);
        System.out.println("Final Rate: " + this.finalRate);
    }
}
