import java.util.Scanner;

// Tạo custom exception kế thừa từ Exception
class TuoiKhongHopLeException extends Exception {
    public TuoiKhongHopLeException(String message) {
        super(message);
    }
}

public class Main {
    // Phương thức kiểm tra tuổi, nếu không hợp lệ sẽ ném ngoại lệ
    public static void kiemTraTuoi(int tuoi) throws TuoiKhongHopLeException {
        if (tuoi < 18) {
            throw new TuoiKhongHopLeException("Tuổi phải lớn hơn hoặc bằng 18.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập tuổi của bạn: ");
            int tuoi = scanner.nextInt();

            // Gọi phương thức kiểm tra tuổi
            kiemTraTuoi(tuoi);

            System.out.println("Tuổi của bạn hợp lệ!");
        } catch (TuoiKhongHopLeException e) {
            // Bắt ngoại lệ và in ra thông báo lỗi
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
