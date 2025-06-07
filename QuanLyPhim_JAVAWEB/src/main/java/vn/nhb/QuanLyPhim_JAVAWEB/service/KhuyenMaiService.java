package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.KhuyenMaiRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.KhuyenMai;

import java.util.List;

@Service
public class KhuyenMaiService {

    @Autowired
    private KhuyenMaiRepositoryJDBC khuyenMaiRepo;

    public List<KhuyenMai> getAll() {
        return khuyenMaiRepo.findAll();
    }

    public KhuyenMai getById(int id) {
        return khuyenMaiRepo.findById(id);
    }

    public void add(KhuyenMai km) {
        khuyenMaiRepo.save(km);
    }

    public void update(KhuyenMai km) {
        khuyenMaiRepo.update(km);
    }

    public void delete(int id) {
        khuyenMaiRepo.delete(id);
    }
}
