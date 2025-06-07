package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.sql.Date;

public class Taikhoan {
	
	private int maTK ;
	
	private String tenTK ;

	private String matKhau ;

	private String email;
	
	private String sdt ;
	
	private Date ngaySinh ;

	private String vaiTro ;

	public Taikhoan(int maTK, String tenTK, String matKhau, String email, String sdt, Date ngaySinh, String vaiTro) {
		super();
		this.maTK = maTK;
		this.tenTK = tenTK;
		this.matKhau = matKhau;
		this.email = email;
		this.sdt = sdt;
		this.ngaySinh = ngaySinh;
		this.vaiTro = vaiTro;
	}
	
	public Taikhoan() {
		
	}

	public int getMaTK() {
		return maTK;
	}

	public void setMaTK(int maTK) {
		this.maTK = maTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	
	
}
