package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phim;

import java.sql.Date; // Thay đổi từ Timestamp sang Date
import java.util.List;

@Repository
public class PhimRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Phim> rowMapper = (rs, rowNum) -> {
        Phim p = new Phim();
        p.setMaPhim(rs.getInt("ma_phim"));
        p.setAnh(rs.getString("anh"));
        p.setDaoDien(rs.getString("dao_dien"));
        p.setMoTa(rs.getString("mo_ta"));
        p.setNgayCn(rs.getDate("ngaycn").toLocalDate()); // Sử dụng getDate thay vì getTimestamp
        p.setNgayKt(rs.getDate("ngaykt").toLocalDate());
        p.setNgonNgu(rs.getString("ngon_ngu"));
        p.setQuocGia(rs.getString("quoc_gia"));
        p.setTenPhim(rs.getString("ten_phim"));
        p.setTheLoai(rs.getString("the_loai"));
        p.setThoiLuong(rs.getInt("thoi_luong"));
        p.setTrailer(rs.getString("traier"));
        return p;
    };

    public List<Phim> findAll() {
        return jdbcTemplate.query("SELECT * FROM phim", rowMapper);
    }

    public Phim findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM phim WHERE ma_phim = ?", rowMapper, id);
    }

    public int save(Phim p) {
        return jdbcTemplate.update(
                "INSERT INTO phim (anh, dao_dien, mo_ta, ngaycn, ngaykt, ngon_ngu, quoc_gia, ten_phim, the_loai, thoi_luong, traier) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                p.getAnh(), p.getDaoDien(), p.getMoTa(),
                Date.valueOf(p.getNgayCn()), // Sử dụng Date.valueOf thay vì Timestamp.valueOf
                Date.valueOf(p.getNgayKt()),
                p.getNgonNgu(), p.getQuocGia(), p.getTenPhim(),
                p.getTheLoai(), p.getThoiLuong(), p.getTrailer()
        );
    }

    public int update(Phim p) {
        return jdbcTemplate.update(
                "UPDATE phim SET anh=?, dao_dien=?, mo_ta=?, ngaycn=?, ngaykt=?, " +
                        "ngon_ngu=?, quoc_gia=?, ten_phim=?, the_loai=?, thoi_luong=?, traier=? " +
                        "WHERE ma_phim=?",
                p.getAnh(), p.getDaoDien(), p.getMoTa(),
                Date.valueOf(p.getNgayCn()),
                Date.valueOf(p.getNgayKt()),
                p.getNgonNgu(), p.getQuocGia(), p.getTenPhim(),
                p.getTheLoai(), p.getThoiLuong(), p.getTrailer(),
                p.getMaPhim()
        );
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM phim WHERE ma_phim = ?", id);
    }
}