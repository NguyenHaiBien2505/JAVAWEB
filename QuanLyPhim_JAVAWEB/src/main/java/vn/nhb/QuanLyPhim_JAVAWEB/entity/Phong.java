package vn.nhb.QuanLyPhim_JAVAWEB.entity;

public class Phong {
	private int maPhong ;

	private String tenPhong;

	private boolean trangThai; 

	private Rap maRap ;
	
	private int soGhe ;

	public Phong(int maPhong, String tenPhong, boolean trangThai, Rap maRap, int soGhe) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.trangThai = trangThai;
		this.maRap = maRap;
		this.soGhe = soGhe;
	}
	
	public Phong() {
		
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public Rap getMaRap() {
		return maRap;
	}

	public void setMaRap(Rap maRap) {
		this.maRap = maRap;
	}

	public int getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	
}
