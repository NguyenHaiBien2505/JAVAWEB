package vn.nhb.QuanLyPhim_JAVAWEB.entity;

public class Rap {
	
	private int maRap ;

	private String tenRap ;

	private String diaChi ;

	private String sdt ;

	private String moTa ;

	public Rap(int maRap, String tenRap, String diaChi, String sdt, String moTa) {
		super();
		this.maRap = maRap;
		this.tenRap = tenRap;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.moTa = moTa;
	}

	public Rap() {
		
	}

	public int getMaRap() {
		return maRap;
	}

	public void setMaRap(int maRap) {
		this.maRap = maRap;
	}

	public String getTenRap() {
		return tenRap;
	}

	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
}
