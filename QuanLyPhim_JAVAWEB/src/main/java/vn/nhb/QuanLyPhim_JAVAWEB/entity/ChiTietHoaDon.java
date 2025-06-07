package vn.nhb.QuanLyPhim_JAVAWEB.entity;

import java.math.BigDecimal;

public class ChiTietHoaDon {
    private int maCTHD;
    private HoaDon maHD;
    private Ve maVe;

    private BigDecimal giaVe;
    
    public ChiTietHoaDon() {
    	
    }

	public ChiTietHoaDon(int maCTHD, HoaDon maHD, Ve maVe, BigDecimal giaVe) {
		super();
		this.maCTHD = maCTHD;
		this.maHD = maHD;
		this.maVe = maVe;
		this.giaVe = giaVe;
	}

	public int getMaCTHD() {
		return maCTHD;
	}

	public void setMaCTHD(int maCTHD) {
		this.maCTHD = maCTHD;
	}

	public HoaDon getMaHD() {
		return maHD;
	}

	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}

	public Ve getMaVe() {
		return maVe;
	}

	public void setMaVe(Ve maVe) {
		this.maVe = maVe;
	}

	public BigDecimal getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(BigDecimal giaVe) {
		this.giaVe = giaVe;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [maCTHD=" + maCTHD + ", maHD=" + maHD + ", maVe=" + maVe + ", giaVe=" + giaVe + "]";
	}
    
}
