public class TruongDaiHoc {
    private String tenTruong;
    private float diemChuan;
    
    // Constructor
    public TruongDaiHoc(String tenTruong, float diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }
    
    // Phương thức xét tuyển
    public void xetTuyen(float diemXetTuyen, boolean diemLiet) {
        if (diemXetTuyen >= diemChuan && !diemLiet) {
            System.out.println("Chuc mung ban " + tenTruong + " da trung tuyen");
        } else {
            System.out.println("Rat tiec, ban " + tenTruong + " chua du dieu kien trung tuyen");
        }
    }
}
