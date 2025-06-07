package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.PhongRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phong;

import java.util.List;

@Service
public class PhongService {

    @Autowired
    private PhongRepositoryJDBC phongRepo;

    public List<Phong> getAll() {
        return phongRepo.findAll();
    }

    public Phong getById(int id) {
        return phongRepo.findById(id);
    }

    public void add(Phong phong) {
        phongRepo.save(phong);
    }

    public void update(Phong phong) {
        phongRepo.update(phong);
    }

    public void delete(int id) {
        phongRepo.delete(id);
    }
}
