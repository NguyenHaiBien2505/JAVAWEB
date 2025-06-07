package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.TaiKhoanRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Taikhoan;

import java.util.List;

@Service
public class TaiKhoanService {
    @Autowired
    private TaiKhoanRepositoryJDBC repository;


    // Phương thức để lấy danh sách tài khoản
    public List<Taikhoan> getAllTaiKhoan() {
        return repository.findAll();
    }
    // Phương thức để lấy tài khoản theo ID
    public Taikhoan getTaiKhoanByID(int mtk){
        return repository.findById(mtk);
    }
    // Phương thức để thêm tài khoản mới
    public int saveTaiKhoan(Taikhoan taiKhoan) {
        return repository.save(taiKhoan);
    }
    // Phương thức để cập nhật tài khoản
    public int updateTaiKhoan(Taikhoan taiKhoan) {
        return repository.update(taiKhoan);
    }
    // Phương thức để xóa tài khoản
    public int deleteTaiKhoan(int mtk) {
        return repository.delete(mtk);
    }

}
