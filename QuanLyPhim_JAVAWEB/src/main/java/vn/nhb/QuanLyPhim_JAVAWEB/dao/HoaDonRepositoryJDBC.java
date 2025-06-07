package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.HoaDon;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Taikhoan;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.KhuyenMai;
import vn.nhb.QuanLyPhim_JAVAWEB.service.TaiKhoanService;
import vn.nhb.QuanLyPhim_JAVAWEB.service.KhuyenMaiService;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class HoaDonRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TaiKhoanService taiKhoanService;

    @Autowired
    private KhuyenMaiService khuyenMaiService;

    private final RowMapper<HoaDon> rowMapper = (rs, rowNum) -> {
        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaHD(rs.getInt("mahd"));
        hoaDon.setEmail(rs.getString("email"));
        hoaDon.setNgayDat(new Date(rs.getTimestamp("ngay_dat").getTime()));
        hoaDon.setSdt(rs.getString("sdt"));
        hoaDon.setSoLuong(rs.getInt("so_luong"));
        hoaDon.setTenKH(rs.getString("tenkh"));
        hoaDon.setTongGia(rs.getBigDecimal("tong_gia"));

        int matk = rs.getInt("matk");
        Taikhoan tk = taiKhoanService.getTaiKhoanByID(matk);
        hoaDon.setMaTK(tk);

        int makm = rs.getInt("makm");
        KhuyenMai km = khuyenMaiService.getById(makm);
        hoaDon.setMaKM(km);

        return hoaDon;
    };

    // Read all
    public List<HoaDon> findAll() {
        return jdbcTemplate.query("SELECT * FROM hoa_don", rowMapper);
    }

    // Read by ID
    public HoaDon findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM hoa_don WHERE mahd = ?", rowMapper, id);
    }

    // Create
    public int save(HoaDon hd) {
        return jdbcTemplate.update(
                "INSERT INTO hoa_don (email, ngay_dat, sdt, so_luong, tenkh, tong_gia, makm, matk) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                hd.getEmail(),
                new Timestamp(hd.getNgayDat().getTime()),
                hd.getSdt(),
                hd.getSoLuong(),
                hd.getTenKH(),
                hd.getTongGia(),
                hd.getMaKM().getMakm(),
                hd.getMaTK().getMaTK()
        );
    }

    // Update
    public int update(HoaDon hd) {
        return jdbcTemplate.update(
                "UPDATE hoa_don SET email = ?, ngay_dat = ?, sdt = ?, so_luong = ?, tenkh = ?, tong_gia = ?, makm = ?, matk = ? WHERE mahd = ?",
                hd.getEmail(),
                new Timestamp(hd.getNgayDat().getTime()),
                hd.getSdt(),
                hd.getSoLuong(),
                hd.getTenKH(),
                hd.getTongGia(),
                hd.getMaKM().getMakm(),
                hd.getMaTK().getMaTK(),
                hd.getMaHD()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM hoa_don WHERE mahd = ?", id);
    }
}
