package vn.nhb.QuanLyPhim_JAVAWEB.entity;
public class Ghe {
	private int maGhe;

	private Phong maPhong ;

	private String tenGhe ;

	private int hang ;

	private int cot ;

	private boolean trangThaiGhe ;

	private LoaiGhe maLoaiGhe ;
	
	public Ghe() {
		
	}

	public Ghe(int maGhe, Phong maPhong, String tenGhe, int hang, int cot, boolean trangThaiGhe, LoaiGhe maLoaiGhe) {
		super();
		this.maGhe = maGhe;
		this.maPhong = maPhong;
		this.tenGhe = tenGhe;
		this.hang = hang;
		this.cot = cot;
		this.trangThaiGhe = trangThaiGhe;
		this.maLoaiGhe = maLoaiGhe;
	}

	public int getMaGhe() {
		return maGhe;
	}

	public void setMaGhe(int maGhe) {
		this.maGhe = maGhe;
	}

	public Phong getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(Phong maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenGhe() {
		return tenGhe;
	}

	public void setTenGhe(String tenGhe) {
		this.tenGhe = tenGhe;
	}

	public int getHang() {
		return hang;
	}

	public void setHang(int hang) {
		this.hang = hang;
	}

	public int getCot() {
		return cot;
	}

	public void setCot(int cot) {
		this.cot = cot;
	}

	public boolean isTrangThaiGhe() {
		return trangThaiGhe;
	}

	public void setTrangThaiGhe(boolean trangThaiGhe) {
		this.trangThaiGhe = trangThaiGhe;
	}

	public LoaiGhe getMaLoaiGhe() {
		return maLoaiGhe;
	}

	public void setMaLoaiGhe(LoaiGhe maLoaiGhe) {
		this.maLoaiGhe = maLoaiGhe;
	}
	
	
}
