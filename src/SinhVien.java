public class SinhVien {
    private int MaSV;
    private String TenSV;
    private double DiemTB;
    private int DiemRL;

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int maSV) {
        MaSV = maSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double diemTB) {
        DiemTB = diemTB;
    }

    public int getDiemRL() {
        return DiemRL;
    }

    public void setDiemRL(int diemRL) {
        DiemRL = diemRL;
    }

    public String coNhanDuocHocBong(double diemTB, int diemRL){
        if(diemTB >= 9){
            if(diemRL >= 90)
                return "Xuất sắc";
            else if(diemRL >= 80){
                return "Giỏi";
            } else if (diemRL >= 70)
                return "Khá";
        } else if(diemTB >= 8) {
            if(diemRL >= 80)
                return "Giỏi";
            else if (diemRL >= 70)
                return "Khá";
        } else if(diemTB >= 7) {
            if (diemRL >= 70)
                return "Khá";
        }
        return "Không được";
    }
}
