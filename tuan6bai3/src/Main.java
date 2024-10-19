import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe 1, xe 2, xe 3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = sc.nextInt();
            sc.nextLine();  // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    // Nhập thông tin cho các xe
                    for (int i = 0; i < vehicles.length; i++) {
                        System.out.println("Nhập thông tin cho xe " + (i + 1));
                        System.out.print("Chủ sở hữu: ");
                        String owner = sc.nextLine();
                        System.out.print("Loại xe: ");
                        String type = sc.nextLine();
                        System.out.print("Trị giá xe: ");
                        double value = sc.nextDouble();
                        System.out.print("Dung tích xylanh (cc): ");
                        int engineCapacity = sc.nextInt();
                        sc.nextLine();  // Đọc bỏ dòng new line
                        vehicles[i] = new Vehicle(owner, type, value, engineCapacity);
                    }
                    break;

                case 2:
                    // Xuất bảng kê khai tiền thuế trước bạ
                    System.out.println("\n===== Bảng kê khai tiền thuế trước bạ =====");
                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] != null) {
                            vehicles[i].displayInfo();
                        } else {
                            System.out.println("Chưa có thông tin cho xe " + (i + 1) + ".\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 3);

        sc.close();
    }
}