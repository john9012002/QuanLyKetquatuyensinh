public class App {
       public static void main(String[] args) {
        // Nhập thông tin của 3 thí sinh
        ThiSinh thiSinh1 = new ThiSinh();
        thiSinh1.nhapThongTin();
        
        ThiSinh thiSinh2 = new ThiSinh();
        thiSinh2.nhapThongTin();
        

        ThiSinh thiSinh3 = new ThiSinh();
        thiSinh3.nhapThongTin();
        
        // Xét tuyển của 3 thí sinh vào các trường đại học
        TruongDaiHoc truongHSU = new TruongDaiHoc("HSU", 15);
        TruongDaiHoc truongHUTECH = new TruongDaiHoc("HUTECH", 16);
        TruongDaiHoc truongSGU = new TruongDaiHoc("SGU", 15.5f);
        
        float diemXetTuyen1 = thiSinh1.tinhDiemXetTuyen();
        boolean diemLiet1 = thiSinh1.kiemTraDiemLiet();
        truongHSU.xetTuyen(diemXetTuyen1, diemLiet1);
        truongHUTECH.xetTuyen(diemXetTuyen1, diemLiet1);
        truongSGU.xetTuyen(diemXetTuyen1, diemLiet1);
        
        float diemXetTuyen2 = thiSinh2.tinhDiemXetTuyen();
        boolean diemLiet2 = thiSinh2.kiemTraDiemLiet();
        truongHSU.xetTuyen(diemXetTuyen2, diemLiet2);
        truongHUTECH.xetTuyen(diemXetTuyen2, diemLiet2);
        truongSGU.xetTuyen(diemXetTuyen2, diemLiet2);
        
        float diemXetTuyen3 = thiSinh3.tinhDiemXetTuyen();
        boolean diemLiet3 = thiSinh3.kiemTraDiemLiet();
        truongHSU.xetTuyen(diemXetTuyen3, diemLiet3);
        truongHUTECH.xetTuyen(diemXetTuyen3, diemLiet3);
        truongSGU.xetTuyen(diemXetTuyen3, diemLiet3);
    }
}