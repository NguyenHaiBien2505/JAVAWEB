package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class KhuyenMai {
	private int makm;
	
	private String tenKM;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayBD;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayKT;
	
	private Phim maPhim ;
	
	private String anh ;
	
	private float giaTriKM;

	public KhuyenMai(int makm, String tenKM, Date ngayBD, Date ngayKT, Phim maPhim, String anh, float giaTriKM) {
		super();
		this.makm = makm;
		this.tenKM = tenKM;
		this.ngayBD = ngayBD;
		this.ngayKT = ngayKT;
		this.maPhim = maPhim;
		this.anh = anh;
		this.giaTriKM = giaTriKM;
	}
	
	public KhuyenMai() {
		
	}

	public int getMakm() {
		return makm;
	}

	public void setMakm(int makm) {
		this.makm = makm;
	}

	public String getTenKM() {
		return tenKM;
	}

	public void setTenKM(String tenKM) {
		this.tenKM = tenKM;
	}

	public Date getNgayBD() {
		return ngayBD;
	}

	public void setNgayBD(Date ngayBD) {
		this.ngayBD = ngayBD;
	}

	public Date getNgayKT() {
		return ngayKT;
	}

	public void setNgayKT(Date ngayKT) {
		this.ngayKT = ngayKT;
	}

	public Phim getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public float getGiaTriKM() {
		return giaTriKM;
	}

	public void setGiaTriKM(float giaTriKM) {
		this.giaTriKM = giaTriKM;
	}
	
}
