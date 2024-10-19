public class Textbook extends Book {
    private String tinhTrang; // mới hoặc cũ

    public Textbook(String maSach, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return super.tinhThanhTien();
        } else {
            return super.tinhThanhTien() * 0.5; // nếu sách cũ, giá sẽ giảm 50%
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Tình trạng: " + tinhTrang + ", Thành tiền: " + tinhThanhTien());
    }
}
