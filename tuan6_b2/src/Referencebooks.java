public class Referencebooks extends Book {
    private double thue;

    public Referencebooks(String maSach, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double tinhThanhTien() {
        return super.tinhThanhTien() + thue; // thêm thuế vào thành tiền
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Thuế: " + thue + ", Thành tiền: " + tinhThanhTien());
    }
}