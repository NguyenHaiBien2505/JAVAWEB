package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Rap;

import java.util.List;

@Repository
public class RapRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Rap> rowMapper = (rs, rowNum) -> {
        Rap rap = new Rap();
        rap.setMaRap(rs.getInt("ma_rap"));
        rap.setTenRap(rs.getString("ten_rap"));
        rap.setDiaChi(rs.getString("dia_chi"));
        rap.setSdt(rs.getString("sdt"));
        rap.setMoTa(rs.getString("mo_ta"));
        return rap;
    };

    // Create
    public int save(Rap rap) {
        return jdbcTemplate.update(
                "INSERT INTO rap (ten_rap, dia_chi, sdt, mo_ta) VALUES (?, ?, ?, ?)",
                rap.getTenRap(), rap.getDiaChi(), rap.getSdt(), rap.getMoTa()
        );
    }

    // Read all
    public List<Rap> findAll() {
        return jdbcTemplate.query("SELECT * FROM rap", rowMapper);
    }

    // Read by id
    public Rap findById(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM rap WHERE ma_rap = ?",
                rowMapper, id
        );
    }

    // Update
    public int update(Rap rap) {
        return jdbcTemplate.update(
                "UPDATE rap SET ten_rap = ?, dia_chi = ?, sdt = ?, mo_ta = ? WHERE ma_rap = ?",
                rap.getTenRap(), rap.getDiaChi(), rap.getSdt(), rap.getMoTa(), rap.getMaRap()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM rap WHERE ma_rap = ?", id);
    }
}
