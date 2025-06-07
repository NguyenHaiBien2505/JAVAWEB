package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.LoaiGhe;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class LoaiGheRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<LoaiGhe> rowMapper = (rs, rowNum) -> {
        LoaiGhe loaiGhe = new LoaiGhe();
        loaiGhe.setMaLoaiGhe(rs.getInt("ma_loai_ghe"));
        loaiGhe.setTenLoaiGhe(rs.getString("ten_loai_ghe"));
        loaiGhe.setGiaThem(rs.getBigDecimal("gia_them"));
        return loaiGhe;
    };

    // Read all
    public List<LoaiGhe> findAll() {
        return jdbcTemplate.query("SELECT * FROM loai_ghe", rowMapper);
    }

    // Read by id
    public LoaiGhe findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM loai_ghe WHERE ma_loai_ghe = ?", rowMapper, id);
    }

    // Create
    public int save(LoaiGhe loaiGhe) {
        return jdbcTemplate.update(
                "INSERT INTO loai_ghe (ten_loai_ghe, gia_them) VALUES (?, ?)",
                loaiGhe.getTenLoaiGhe(), loaiGhe.getGiaThem()
        );
    }

    // Update
    public int update(LoaiGhe loaiGhe) {
        return jdbcTemplate.update(
                "UPDATE loai_ghe SET ten_loai_ghe = ?, gia_them = ? WHERE ma_loai_ghe = ?",
                loaiGhe.getTenLoaiGhe(), loaiGhe.getGiaThem(), loaiGhe.getMaLoaiGhe()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM loai_ghe WHERE ma_loai_ghe = ?", id);
    }
}
