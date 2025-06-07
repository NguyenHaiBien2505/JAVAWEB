package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.LoaiGheRepositoryJDBC;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.LoaiGhe;

import java.util.List;

@Service
public class LoaiGheService {

    @Autowired
    private LoaiGheRepositoryJDBC loaiGheRepo;

    public List<LoaiGhe> getAll() {
        return loaiGheRepo.findAll();
    }

    public LoaiGhe getById(int id) {
        return loaiGheRepo.findById(id);
    }

    public void add(LoaiGhe loaiGhe) {
        loaiGheRepo.save(loaiGhe);
    }

    public void update(LoaiGhe loaiGhe) {
        loaiGheRepo.update(loaiGhe);
    }

    public void delete(int id) {
        loaiGheRepo.delete(id);
    }
}
