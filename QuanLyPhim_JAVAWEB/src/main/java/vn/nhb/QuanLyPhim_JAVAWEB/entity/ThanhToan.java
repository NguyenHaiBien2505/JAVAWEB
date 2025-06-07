package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.sql.Date;

public class ThanhToan {

	private int maThanhToan;

	private HoaDon maHD;

	private String phuongThuc;

	private String trangThai;

	private Date ngayThanhToan;

	public ThanhToan(int maThanhToan, HoaDon maHD, String phuongThuc, String trangThai, Date ngayThanhToan) {
		super();
		this.maThanhToan = maThanhToan;
		this.maHD = maHD;
		this.phuongThuc = phuongThuc;
		this.trangThai = trangThai;
		this.ngayThanhToan = ngayThanhToan;
	}

	public ThanhToan() {

	}

	public int getMaThanhToan() {
		return maThanhToan;
	}

	public void setMaThanhToan(int maThanhToan) {
		this.maThanhToan = maThanhToan;
	}

	public HoaDon getMaHD() {
		return maHD;
	}

	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}

	public String getPhuongThuc() {
		return phuongThuc;
	}

	public void setPhuongThuc(String phuongThuc) {
		this.phuongThuc = phuongThuc;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}

	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}

}
