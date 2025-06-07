package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.math.BigDecimal;

public class Ve {
    private int  maVe;
    private Phim maPhim;
    private SuatChieu maSC;
    private Ghe maGhe ;
    private BigDecimal giaVe ;

    private String trangThai ;

    public Ve(int maVe, Phim maPhim, SuatChieu maSC, Ghe maGhe, BigDecimal giaVe, String trangThai) {
        super();
        this.maVe = maVe;
        this.maPhim = maPhim;
        this.maSC = maSC;
        this.maGhe = maGhe;
        this.giaVe = giaVe;
        this.trangThai = trangThai;
    }

    public Ve() {

    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public Phim getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(Phim maPhim) {
        this.maPhim = maPhim;
    }

    public SuatChieu getMaSC() {
        return maSC;
    }

    public void setMaSC(SuatChieu maSC) {
        this.maSC = maSC;
    }

    public Ghe getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(Ghe maGhe) {
        this.maGhe = maGhe;
    }

    public BigDecimal getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(BigDecimal giaVe) {
        this.giaVe = giaVe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }


}
