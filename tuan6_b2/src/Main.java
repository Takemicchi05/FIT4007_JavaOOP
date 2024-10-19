public class Main {
    public static void main(String[] args) {
        Library thuVien = new Library();

        // Thêm sách mẫu
        thuVien.themSach(new Textbook("SGK001", 50000, 10, "NXB A", "moi"));
        thuVien.themSach(new Textbook("SGK002", 30000, 5, "NXB B", "cu"));
        thuVien.themSach(new Referencebooks("STK001", 70000, 7, "NXB C", 5000));

        // Xuất sách giáo khoa của NXB A
        System.out.println("Danh sách sách giáo khoa của NXB A:");
        thuVien.xuatSachGiaoKhoaNhaXuatBanX("NXB A");

        // Tính tổng thành tiền
        System.out.println("Tổng thành tiền sách giáo khoa: " + thuVien.tongThanhTienSachGiaoKhoa());
        System.out.println("Tổng thành tiền sách tham khảo: " + thuVien.tongThanhTienSachThamKhao());
    }
}