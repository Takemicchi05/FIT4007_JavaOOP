import java.util.ArrayList;
import java.util.Random;

public class EmployeeManager {
    private ArrayList<String> employees = new ArrayList<>(); // Sử dụng ArrayList để lưu tên nhân viên

    // Phương thức thêm nhân viên
    public void addEmployee(String name) {
        employees.add(name);
    }

    // Phương thức chọn ngẫu nhiên nhân viên
    public String pickRandomEmployee() {
        Random random = new Random();
        int randomIndex = random.nextInt(employees.size()); // Chọn chỉ số ngẫu nhiên
        return employees.get(randomIndex); // Trả về tên nhân viên được chọn
    }

    // Phương thức kiểm tra danh sách có trống hay không
    public boolean hasEmployees() {
        return !employees.isEmpty();
    }
}
