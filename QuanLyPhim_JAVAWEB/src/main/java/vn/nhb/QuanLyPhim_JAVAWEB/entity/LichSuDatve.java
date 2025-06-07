package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.sql.Date;


public class LichSuDatve {

    private int maLichSu ;

    private Taikhoan maTK ;

    private Ve maVe;

    private Date ngayDat ;

    public LichSuDatve(int maLichSu, Taikhoan maTK, Ve maVe, Date ngayDat) {
        super();
        this.maLichSu = maLichSu;
        this.maTK = maTK;
        this.maVe = maVe;
        this.ngayDat = ngayDat;
    }

    public LichSuDatve() {

    }

    public int getMaLichSu() {
        return maLichSu;
    }

    public void setMaLichSu(int maLichSu) {
        this.maLichSu = maLichSu;
    }

    public Taikhoan getMaTK() {
        return maTK;
    }

    public void setMaTK(Taikhoan maTK) {
        this.maTK = maTK;
    }

    public Ve getMaVe() {
        return maVe;
    }

    public void setMaVe(Ve maVe) {
        this.maVe = maVe;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

}
