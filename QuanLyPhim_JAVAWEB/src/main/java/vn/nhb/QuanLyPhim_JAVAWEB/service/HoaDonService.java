package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.HoaDonRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.HoaDon;

import java.util.List;

@Service
public class HoaDonService {

    @Autowired
    private HoaDonRepositoryJDBC repository;

    // Lấy danh sách tất cả hóa đơn
    public List<HoaDon> getAllHoaDon() {
        return repository.findAll();
    }

    // Lấy hóa đơn theo ID
    public HoaDon getHoaDonById(int id) {
        return repository.findById(id);
    }

    // Thêm hóa đơn mới
    public int saveHoaDon(HoaDon hoaDon) {
        return repository.save(hoaDon);
    }

    // Cập nhật hóa đơn
    public int updateHoaDon(HoaDon hoaDon) {
        return repository.update(hoaDon);
    }

    // Xoá hóa đơn
    public int deleteHoaDon(int id) {
        return repository.delete(id);
    }
}
