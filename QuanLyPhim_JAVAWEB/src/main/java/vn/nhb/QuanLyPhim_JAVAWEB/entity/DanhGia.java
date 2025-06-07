package vn.nhb.QuanLyPhim_JAVAWEB.entity;

public class DanhGia {
    private int maDG ;

    private Taikhoan maTK ;

    private Phim maPhim ;

    private String noiDung ;

    private float diemSo;

    private String trangThai ;

    public DanhGia(int maDG, Taikhoan maTK, Phim maPhim, String noiDung, float diemSo, String trangThai) {
        super();
        this.maDG = maDG;
        this.maTK = maTK;
        this.maPhim = maPhim;
        this.noiDung = noiDung;
        this.diemSo = diemSo;
        this.trangThai = trangThai;
    }

    public DanhGia() {

    }

    public int getMaDG() {
        return maDG;
    }

    public void setMaDG(int maDG) {
        this.maDG = maDG;
    }

    public Taikhoan getMaTK() {
        return maTK;
    }

    public void setMaTK(Taikhoan maTK) {
        this.maTK = maTK;
    }

    public Phim getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(Phim maPhim) {
        this.maPhim = maPhim;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DanhGia [maDG=" + maDG + ", maTK=" + maTK + ", maPhim=" + maPhim + ", noiDung=" + noiDung + ", diemSo="
                + diemSo + ", trangThai=" + trangThai + "]";
    }



}
