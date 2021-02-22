package entities;




public class Material {
    
    // Private attributes 
    
    private String name;
    private int coeff;
    private float ecd;
    private float emd;
    private boolean hasTp;
    private float tp;
    private float rate;

    // Constructor 
    
    public Material (String name, int coeff, float ecd, float emd, boolean hasTp, float tp){
        this.name = name;
        this.coeff = coeff;
        this.ecd = ecd;
        this.emd = emd;
        this.tp = hasTp ? tp : 0; //ternary operation
        this.rate = 0 ;
    }

    // getters / setters 

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getCoeff() {return this.coeff;}
    public void setCoeff(int coeff) {this.coeff = coeff;}
    
    public float getEcd() {return this.ecd;}
    public void setEcd(float ecd) {this.ecd = ecd;}
    
    public float getEmd() {return this.emd;}
    public void setEmd(float emd) {this.emd = emd;}
    
    public boolean getHasTp() {return this.hasTp;}
    public void setHasTp(boolean hasTp) {this.hasTp = hasTp;}
    
    public float getTp() {return this.tp;}
    public void setTp(float tp) {this.tp = tp;}
    
    public float getRate() {return this.rate;}
    public void setRate(float rate) {this.rate = rate;}

}
