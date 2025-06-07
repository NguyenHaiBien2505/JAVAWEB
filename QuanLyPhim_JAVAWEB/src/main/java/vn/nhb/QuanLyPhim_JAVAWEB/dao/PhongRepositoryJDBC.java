package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phong;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Rap;
import vn.nhb.QuanLyPhim_JAVAWEB.service.RapService;

import java.util.List;

@Repository
public class PhongRepositoryJDBC {
    @Autowired
    private RapService rapService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Phong> rowMapper = (rs, rowNum) -> {
        Phong phong = new Phong();
        phong.setMaPhong(rs.getInt("ma_phong"));
        phong.setTenPhong(rs.getString("ten_phong"));
        phong.setTrangThai(rs.getBoolean("trang_thai"));
        phong.setSoGhe(rs.getInt("so_ghe"));

        Rap rap = new Rap();
        rap.setMaRap(rs.getInt("ma_rap"));
        rap = rapService.getRapById(rap.getMaRap()); // Ensure Rap is fully initialized
        phong.setMaRap(rap);
        return phong;
    };

    // Read all
    public List<Phong> findAll() {
        return jdbcTemplate.query("SELECT * FROM phong", rowMapper);
    }

    // Read by id
    public Phong findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM phong WHERE ma_phong = ?", rowMapper, id);
    }

    // Create
    public int save(Phong phong) {
        return jdbcTemplate.update(
                "INSERT INTO phong (ten_phong, trang_thai, so_ghe, ma_rap) VALUES (?, ?, ?, ?)",
                phong.getTenPhong(), phong.isTrangThai(), phong.getSoGhe(), phong.getMaRap().getMaRap()
        );
    }

    // Update
    public int update(Phong phong) {
        return jdbcTemplate.update(
                "UPDATE phong SET ten_phong = ?, trang_thai = ?, so_ghe = ?, ma_rap = ? WHERE ma_phong = ?",
                phong.getTenPhong(), phong.isTrangThai(), phong.getSoGhe(),
                phong.getMaRap().getMaRap(), phong.getMaPhong()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM phong WHERE ma_phong = ?", id);
    }
}
