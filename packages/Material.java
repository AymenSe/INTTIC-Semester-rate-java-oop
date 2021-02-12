package packages;

public class Material {
    public String materialName;
    public int coeff;
    private float rate;

    public Material(String materialName, int coeff) {
        this.materialName = materialName;
        this.coeff = coeff;
    }

    public float claculateRate(float emd, float tp, float ecd) {
        this.rate = (((tp + ecd) / 2) + 2 * emd) / 3;
        float finaleRate = this.rate * this.coeff;

        return finaleRate;
    }

}
