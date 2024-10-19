public class Students {
    private int id;
    private String name;
    private float LT;
    private float TH;

    public Students() {
        this.id = 0;
        this.name = "";
        this.LT = 0.0f;
        this.TH = 0.0f;
    }

    public Students(int id, String name, float LT, float TH) {
        this.id = id;
        this.name = name;
        this.LT = LT;
        this.TH = TH;
    }

    public int getId() {
        return id;
    }

    public void setId(int maSV) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return LT;
    }

    public void setDiemLT(float LT) {
        this.LT = LT;
    }

    public float getDiemTH() {
        return TH;
    }

    public void setDiemTH(float TH) {
        this.TH = TH;
    }

    public float tinhDiemTB() {
        return (LT + TH) / 2;
    }

    // Method to describe the object as a string new
    public String toString() {
        return id + "\t" + name + "\t" + LT + "\t" + TH + "\t" + tinhDiemTB();
    }
}