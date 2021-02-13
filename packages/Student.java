package packages;


public class Student {

    // Private Attributs
    private String firstName;
    private String lastName;
    private int level;
    private float finalRate = 0;

    // Constructor
    public Student(String firstName, String lastName, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
    }

    // getters / setters 
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String firstName) { this.firstName = firstName;}
    
    public String getLastName() {return this.lastName;}
    public void setLastName(String lastName) { this.lastName= lastName;}
    
    public int getLevel() {return this.level;}
    public void setLevel(int level) { this.level = level;}
    
    public float getFinalRate() {return this.finalRate;}
    public void setFinalRate(float finalRate) { this.finalRate = finalRate;}


}
