import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> danhSachSach;

    public Library() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Book sach) {
        danhSachSach.add(sach);
    }

    // Tính tổng thành tiền cho sách giáo khoa
    public double tongThanhTienSachGiaoKhoa() {
        double tong = 0;
        for (Book sach : danhSachSach) {
            if (sach instanceof Textbook) {
                tong += sach.tinhThanhTien();
            }
        }
        return tong;
    }

    // Tính tổng thành tiền cho sách tham khảo
    public double tongThanhTienSachThamKhao() {
        double tong = 0;
        for (Book sach : danhSachSach) {
            if (sach instanceof Referencebooks) {
                tong += sach.tinhThanhTien();
            }
        }
        return tong;
    }

    // Xuất các sách giáo khoa của nhà xuất bản X
    public void xuatSachGiaoKhoaNhaXuatBanX(String nhaXuatBanX) {
        for (Book sach : danhSachSach) {
            if (sach instanceof Textbook && sach.getNhaXuatBan().equalsIgnoreCase(nhaXuatBanX)) {
                sach.xuatThongTin();
            }
        }
    }
}
