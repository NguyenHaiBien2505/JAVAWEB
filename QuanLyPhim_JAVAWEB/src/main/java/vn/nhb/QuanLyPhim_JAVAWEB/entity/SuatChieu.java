package vn.nhb.QuanLyPhim_JAVAWEB.entity;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class SuatChieu {

	private int maSC ;

	private Phim maPhim ;

	private Phong maPhong ;

	private Date ngay;

	private Time thoiGian ;

	private BigDecimal giaVe ;

	public SuatChieu(int maSC, Phim maPhim, Phong maPhong, Date ngay, Time thoiGian, BigDecimal giaVe) {
		super();
		this.maSC = maSC;
		this.maPhim = maPhim;
		this.maPhong = maPhong;
		this.ngay = ngay;
		this.thoiGian = thoiGian;
		this.giaVe = giaVe;
	}

	public SuatChieu() {
		
	}

	public int getMaSC() {
		return maSC;
	}

	public void setMaSC(int maSC) {
		this.maSC = maSC;
	}

	public Phim getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}

	public Phong getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(Phong maPhong) {
		this.maPhong = maPhong;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public Time getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Time thoiGian) {
		this.thoiGian = thoiGian;
	}

	public BigDecimal getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(BigDecimal giaVe) {
		this.giaVe = giaVe;
	}
	
	
}

