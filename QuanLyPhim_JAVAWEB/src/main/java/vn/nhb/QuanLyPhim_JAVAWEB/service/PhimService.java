package vn.nhb.QuanLyPhim_JAVAWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phim;
import vn.nhb.QuanLyPhim_JAVAWEB.dao.PhimRepositoryJDBC;

import java.util.List;

@Service
public class PhimService {

    @Autowired
    private PhimRepositoryJDBC repository;

    public List<Phim> getAllPhim() {
        return repository.findAll();
    }

    public Phim getPhimById(int id) {
        return repository.findById(id);
    }

    public int savePhim(Phim phim) {
        return repository.save(phim);
    }

    public int updatePhim(Phim phim) {
        return repository.update(phim);
    }

    public int deletePhim(int id) {
        return repository.delete(id);
    }
}