package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.RapRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Rap;

import java.util.List;

@Service
public class RapService {
    @Autowired
    private RapRepositoryJDBC repository;
    // Phương thức để lấy danh sách rạp
    public List<Rap> getAllRap() {
        return repository.findAll();
    }
    // Phương thức để lấy rạp theo ID
    public Rap getRapById(int id) {
        return repository.findById(id);
    }
    // Phương thức để thêm rạp mới
    public int saveRap(Rap rap) {
        return repository.save(rap);
    }
    // Phương thức để cập nhật rạp
    public int updateRap(Rap rap) {
        return repository.update(rap);
    }
    // Phương thức để xóa rạp
    public int deleteRap(int id) {
        return repository.delete(id);
    }
}
