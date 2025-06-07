package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class HoaDon {

    private int maHD;

    private Taikhoan maTK;
    
    private int soLuong;

    private BigDecimal tongGia;

    private String tenKH;

    private String sdt;

    private String email;

    private Date ngayDat;

    private KhuyenMai maKM;

    public HoaDon() {
    	
    }

	public HoaDon(int maHD, Taikhoan maTK, int soLuong, BigDecimal tongGia, String tenKH, String sdt, String email,
			Date ngayDat, KhuyenMai maKM) {
		super();
		this.maHD = maHD;
		this.maTK = maTK;
		this.soLuong = soLuong;
		this.tongGia = tongGia;
		this.tenKH = tenKH;
		this.sdt = sdt;
		this.email = email;
		this.ngayDat = ngayDat;
		this.maKM = maKM;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public Taikhoan getMaTK() {
		return maTK;
	}

	public void setMaTK(Taikhoan maTK) {
		this.maTK = maTK;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getTongGia() {
		return tongGia;
	}

	public void setTongGia(BigDecimal tongGia) {
		this.tongGia = tongGia;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public KhuyenMai getMaKM() {
		return maKM;
	}

	public void setMaKM(KhuyenMai maKM) {
		this.maKM = maKM;
	}
    
    
}
