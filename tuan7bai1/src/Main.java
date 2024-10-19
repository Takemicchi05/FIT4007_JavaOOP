import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(); // Tạo đối tượng quản lý nhân viên
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng nhân viên
        System.out.println("Nhập số lượng nhân viên: ");
        int soNhanvien = scanner.nextInt();
        scanner.nextLine();  // Bỏ qua dòng trống sau khi nhập số

        // Nhập tên nhân viên
        for (int i = 0; i < soNhanvien; i++) {
            System.out.println("Nhập tên nhân viên thứ " + (i + 1) + ":");
            String name = scanner.nextLine();
            manager.addEmployee(name); // Thêm nhân viên vào danh sách
        }

        // Kiểm tra nếu có nhân viên, chọn ngẫu nhiên một người
        if (manager.hasEmployees()) {
            String chosenEmployee = manager.pickRandomEmployee(); // Chọn nhân viên ngẫu nhiên
            System.out.println("Nhân viên được chọn để nhận quà: " + chosenEmployee);
        } else {
            System.out.println("Không có nhân viên nào trong danh sách.");
        }

        scanner.close();
    }
}
