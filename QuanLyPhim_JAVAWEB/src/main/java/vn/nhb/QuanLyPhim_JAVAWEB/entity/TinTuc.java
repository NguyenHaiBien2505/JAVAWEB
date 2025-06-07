package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.sql.Date;
public class TinTuc {

	private int maTT ;

	private String tenTT ;

	private Date ngayDang;

	private String anh ;

	private String noiDung ;

	private String loaiTin ;
	
	private Phim maPhim ;
	
	private Rap MaRap ;

	public TinTuc(int maTT, String tenTT, Date ngayDang, String anh, String noiDung, String loaiTin, Phim maPhim,
			Rap maRap) {
		super();
		this.maTT = maTT;
		this.tenTT = tenTT;
		this.ngayDang = ngayDang;
		this.anh = anh;
		this.noiDung = noiDung;
		this.loaiTin = loaiTin;
		this.maPhim = maPhim;
		MaRap = maRap;
	}

	public TinTuc() {
		
	}
	
	public int getMaTT() {
		return maTT;
	}

	public void setMaTT(int maTT) {
		this.maTT = maTT;
	}

	public String getTenTT() {
		return tenTT;
	}

	public void setTenTT(String tenTT) {
		this.tenTT = tenTT;
	}

	public Date getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getLoaiTin() {
		return loaiTin;
	}

	public void setLoaiTin(String loaiTin) {
		this.loaiTin = loaiTin;
	}

	public Phim getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}

	public Rap getMaRap() {
		return MaRap;
	}

	public void setMaRap(Rap maRap) {
		MaRap = maRap;
	}
	
	
}
