public class Book {
    protected String maSach;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Book(String maSach, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    // Hàm tính thành tiền - mỗi loại sách sẽ có cách tính riêng
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void xuatThongTin() {
        System.out.println("Mã sách: " + maSach + ", Đơn giá: " + donGia + ", Số lượng: " + soLuong + ", Nhà xuất bản: " + nhaXuatBan);
    }
}