package vn.nhb.QuanLyPhim_JAVAWEB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Taikhoan;
import java.util.List;

@Repository
public class TaiKhoanRepositoryJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Taikhoan> rowMapper = (rs, rowNum) -> {
        Taikhoan taiKhoan = new Taikhoan();
        taiKhoan.setMaTK(rs.getInt("matk"));
        taiKhoan.setTenTK(rs.getString("tentk"));
        taiKhoan.setMatKhau(rs.getString("mat_khau"));
        taiKhoan.setEmail(rs.getString("email"));
        taiKhoan.setSdt(rs.getString("sdt"));
        taiKhoan.setNgaySinh(rs.getDate("ngay_sinh"));
        taiKhoan.setVaiTro(rs.getString("vai_tro"));
        return taiKhoan;
    };

    // Create
    public int save(Taikhoan taiKhoan) {
        return jdbcTemplate.update(
                "INSERT INTO tai_khoan (tentk, mat_khau, email, sdt, ngay_sinh, vai_tro) VALUES (?, ?, ?, ?, ?, ?)",
                taiKhoan.getTenTK(), taiKhoan.getMatKhau(), taiKhoan.getEmail(), taiKhoan.getSdt(),
                taiKhoan.getNgaySinh(), taiKhoan.getVaiTro()
        );
    }

    // Read all
    public List<Taikhoan> findAll() {
        return jdbcTemplate.query("SELECT * FROM tai_khoan", rowMapper);
    }

    // Read by id
    public Taikhoan findById(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM tai_khoan WHERE matk = ?",
                rowMapper, id
        );
    }

    // Update
    public int update(Taikhoan taiKhoan) {
        return jdbcTemplate.update(
                "UPDATE tai_khoan SET tentk = ?, mat_khau = ?, email = ?, sdt = ?, ngay_sinh = ?, vai_tro = ? WHERE matk = ?",
                taiKhoan.getTenTK(), taiKhoan.getMatKhau(), taiKhoan.getEmail(), taiKhoan.getSdt(),
                taiKhoan.getNgaySinh(), taiKhoan.getVaiTro(), taiKhoan.getMaTK()
        );
    }

    // Delete
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM tai_khoan WHERE matk = ?", id);
    }

    public static void main(String[] args) {
        new TaiKhoanRepositoryJDBC().findAll().forEach(
                taiKhoan -> System.out.println(taiKhoan.getTenTK() + " - " + taiKhoan.getVaiTro())
        );
    }
}
