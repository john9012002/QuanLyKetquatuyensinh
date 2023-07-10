import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private String soBaoDanh;
    private float diemMon1;
    private float diemMon2;
    private float diemMon3;
    private boolean hocSinhGioi;
    private boolean doiTuongUuTien;
    
    // Constructor
    public ThiSinh() {
        
    }
    
    // Getter methods
    public String getHoTen() {
        return hoTen;
    }
    
    public String getSoBaoDanh() {
        return soBaoDanh;
    }
    
    public float getDiemMon1() {
        return diemMon1;
    }
    
    public float getDiemMon2() {
        return diemMon2;
    }
    
    public float getDiemMon3() {
        return diemMon3;
    }
    
    public boolean isHocSinhGioi() {
        return hocSinhGioi;
    }
    
    public boolean isDoiTuongUuTien() {
        return doiTuongUuTien;
    }
    
    // Setter methods
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }
    
    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }
    
    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }
    
    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }
    
    public void setHocSinhGioi(boolean hocSinhGioi) {
        this.hocSinhGioi = hocSinhGioi;
    }
    
    public void setDoiTuongUuTien(boolean doiTuongUuTien) {
        this.doiTuongUuTien = doiTuongUuTien;
    }
    
    // Phương thức tính điểm xét tuyển
    public float tinhDiemXetTuyen() {
        float diemXetTuyen = diemMon1 + diemMon2 + diemMon3;
        if (hocSinhGioi) {
            diemXetTuyen += 1;
        }
        if (doiTuongUuTien) {
            diemXetTuyen += 0.5;
        }
        return diemXetTuyen;
    }
    
    // Phương thức kiểm tra Điểm liệt
    public boolean kiemTraDiemLiet() {
        if (diemMon1 == 0 || diemMon2 == 0 || diemMon3 == 0) {
            return true;
        }
        return false;
    }
    
    // Phương thức nhập thông tin thí sinh
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap so bao danh: ");
        soBaoDanh = scanner.nextLine();
        System.out.println("Nhap diem mon 1: ");
        diemMon1 = scanner.nextFloat();
        System.out.println("Nhap diem mon 2: ");
        diemMon2 = scanner.nextFloat();
        System.out.println("Nhap diem mon 3: ");
        diemMon3 = scanner.nextFloat();
        System.out.println("Hoc sinh gioi lop 12 (co/khong): ");
        hocSinhGioi = scanner.nextBoolean();
        System.out.println("Doi tuong uu tien (co/khong): ");
        doiTuongUuTien = scanner.nextBoolean();
    }
}