package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Phim {
    private int maPhim;
    private String anh;
    private String daoDien;
    private String moTa;
    private LocalDate ngayCn;
    private LocalDate ngayKt;
    private String ngonNgu;
    private String quocGia;
    private String tenPhim;
    private String theLoai;
    private int thoiLuong;
    private String trailer;

    //     list-danhGia
//     list-Ve
//        list-Rap
//        list-KhuyenMai
//        list-TinTuc
//        list-suatChieu
    // Default constructor
    public Phim() {
    }

    // Constructor with all fields
    public Phim(int maPhim, String anh, String daoDien, String moTa, LocalDate ngayCn,
                LocalDate ngayKt, String ngonNgu, String quocGia, String tenPhim,
                String theLoai, int thoiLuong, String trailer) {
        this.maPhim = maPhim;
        this.anh = anh;
        this.daoDien = daoDien;
        this.moTa = moTa;
        this.ngayCn = ngayCn;
        this.ngayKt = ngayKt;
        this.ngonNgu = ngonNgu;
        this.quocGia = quocGia;
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.thoiLuong = thoiLuong;
        this.trailer = trailer;
    }

    // Getters and Setters
    public int getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(int maPhim) {
        this.maPhim = maPhim;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public LocalDate getNgayCn() {
        return ngayCn;
    }

    public void setNgayCn(LocalDate ngayCn) {
        this.ngayCn = ngayCn;
    }

    public LocalDate getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(LocalDate ngayKt) {
        this.ngayKt = ngayKt;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    // toString method
    @Override
    public String toString() {
        return "Phim{" +
                "maPhim=" + maPhim +
                ", anh='" + anh + '\'' +
                ", daoDien='" + daoDien + '\'' +
                ", moTa='" + moTa + '\'' +
                ", ngayCn=" + ngayCn +
                ", ngayKt=" + ngayKt +
                ", ngonNgu='" + ngonNgu + '\'' +
                ", quocGia='" + quocGia + '\'' +
                ", tenPhim='" + tenPhim + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", thoiLuong=" + thoiLuong +
                ", trailer='" + trailer + '\'' +
                '}';
    }
}
