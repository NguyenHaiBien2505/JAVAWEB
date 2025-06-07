package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.math.BigDecimal;

public class LoaiGhe {
	private int maLoaiGhe ;
	private String tenLoaiGhe ;
	private BigDecimal giaThem ;

	public LoaiGhe(int maLoaiGhe, String tenLoaiGhe, BigDecimal giaThem) {
		super();
		this.maLoaiGhe = maLoaiGhe;
		this.tenLoaiGhe = tenLoaiGhe;
		this.giaThem = giaThem;
	}
	
	public LoaiGhe() {
		
	}

	public int getMaLoaiGhe() {
		return maLoaiGhe;
	}

	public void setMaLoaiGhe(int maLoaiGhe) {
		this.maLoaiGhe = maLoaiGhe;
	}

	public String getTenLoaiGhe() {
		return tenLoaiGhe;
	}

	public void setTenLoaiGhe(String tenLoaiGhe) {
		this.tenLoaiGhe = tenLoaiGhe;
	}

	public BigDecimal getGiaThem() {
		return giaThem;
	}

	public void setGiaThem(BigDecimal giaThem) {
		this.giaThem = giaThem;
	}
	
}
