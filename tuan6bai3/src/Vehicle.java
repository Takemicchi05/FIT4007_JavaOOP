import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class Vehicle {
    private String owner;
    private String type;  // Loại xe
    private double value;  // Trị giá xe
    private int engineCapacity;  // Dung tích xylanh (cc)

    // Constructor
    public Vehicle(String owner, String type, double value, int engineCapacity) {
        this.owner = owner;
        this.type = type;
        this.value = value;
        this.engineCapacity = engineCapacity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Phương thức tính thuế trước bạ
    public double price() {
        if (engineCapacity < 100) {
            return value * 0.01;
        } else if (engineCapacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }

    // Phương thức in thông tin xe và thuế
    public void displayInfo() {
        System.out.println("Chủ sở hữu: " + owner);
        System.out.println("Loại xe: " + type);
        System.out.println("Trị giá xe: " + value);
        System.out.println("Dung tích xylanh: " + engineCapacity + " cc");
        System.out.println("Thuế trước bạ: " + price() + "\n");
    }
}
