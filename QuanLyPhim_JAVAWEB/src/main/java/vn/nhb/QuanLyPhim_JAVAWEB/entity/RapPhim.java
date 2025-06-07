package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.sql.Date;

public class RapPhim {
	
    private Rap maRap;

    private Phim maPhim;

    private Date ngayBatDau;

    private Date ngayKetThuc;

	public RapPhim(Rap maRap, Phim maPhim, Date ngayBatDau, Date ngayKetThuc) {
		super();
		this.maRap = maRap;
		this.maPhim = maPhim;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}
    
	public RapPhim() {
		
	}

	public Rap getMaRap() {
		return maRap;
	}

	public void setMaRap(Rap maRap) {
		this.maRap = maRap;
	}

	public Phim getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(Phim maPhim) {
		this.maPhim = maPhim;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	
	
    
    
}