package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.KhuyenMai;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phim;
import vn.nhb.QuanLyPhim_JAVAWEB.service.PhimService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class KhuyenMaiRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PhimService phimService;

    private final RowMapper<KhuyenMai> rowMapper = (rs, rowNum) -> {
        KhuyenMai khuyenMai = new KhuyenMai();
        khuyenMai.setMakm(rs.getInt("makm"));
        khuyenMai.setTenKM(rs.getString("tenkm"));
        khuyenMai.setAnh(rs.getString("anh"));
        khuyenMai.setGiaTriKM(rs.getFloat("gia_trikm"));
        khuyenMai.setNgayBD(new Date(rs.getTimestamp("ngaybd").getTime()));
        khuyenMai.setNgayKT(new Date(rs.getTimestamp("ngaykt").getTime()));

        Phim phim = new Phim();
        phim.setMaPhim(rs.getInt("ma_phim"));
        phim = phimService.getPhimById(phim.getMaPhim()); // Ensure Phim is fully initialized
        khuyenMai.setMaPhim(phim);

        return khuyenMai;
    };

    // Read all
    public List<KhuyenMai> findAll() {
        return jdbcTemplate.query("SELECT * FROM khuyen_mai", rowMapper);
    }

    // Read by id
    public KhuyenMai findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM khuyen_mai WHERE makm = ?", rowMapper, id);
    }

    // Create
    public int save(KhuyenMai km) {
        return jdbcTemplate.update(
                "INSERT INTO khuyen_mai (tenkm, anh, gia_trikm, ngaybd, ngaykt, ma_phim) VALUES (?, ?, ?, ?, ?, ?)",
                km.getTenKM(), km.getAnh(), km.getGiaTriKM(), new Timestamp(km.getNgayBD().getTime()),
                new Timestamp(km.getNgayKT().getTime()), km.getMaPhim().getMaPhim()
        );
    }

    // Update
    public int update(KhuyenMai km) {
        return jdbcTemplate.update(
                "UPDATE khuyen_mai SET tenkm = ?, anh = ?, gia_trikm = ?, ngaybd = ?, ngaykt = ?, ma_phim = ? WHERE makm = ?",
                km.getTenKM(), km.getAnh(), km.getGiaTriKM(), new Timestamp(km.getNgayBD().getTime()),
                new Timestamp(km.getNgayKT().getTime()), km.getMaPhim().getMaPhim(), km.getMakm()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM khuyen_mai WHERE makm = ?", id);
    }
}
