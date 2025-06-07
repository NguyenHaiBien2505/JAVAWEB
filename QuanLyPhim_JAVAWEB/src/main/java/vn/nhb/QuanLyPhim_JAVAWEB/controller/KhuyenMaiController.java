package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.KhuyenMai;
import vn.nhb.QuanLyPhim_JAVAWEB.service.KhuyenMaiService;
import vn.nhb.QuanLyPhim_JAVAWEB.service.PhimService; // để lấy danh sách phim

@Controller
@RequestMapping("/khuyenmai")
public class KhuyenMaiController {

    @Autowired
    private KhuyenMaiService khuyenMaiService;

    @Autowired
    private PhimService phimService; // Lấy danh sách phim cho dropdown

    @GetMapping
    public String listKhuyenMai(Model model) {
        model.addAttribute("khuyenMaiList", khuyenMaiService.getAll());
        model.addAttribute("phimList", phimService.getAllPhim()); // để chọn phim khi thêm/sửa
        return "khuyenmai"; // tên view html
    }

    @PostMapping("/add")
    public String addKhuyenMai(@ModelAttribute KhuyenMai km) {
        khuyenMaiService.add(km);
        return "redirect:/khuyenmai";
    }

    @PostMapping("/update")
    public String updateKhuyenMai(@ModelAttribute KhuyenMai km) {
        khuyenMaiService.update(km);
        return "redirect:/khuyenmai";
    }

    @PostMapping("/delete/{id}")
    public String deleteKhuyenMai(@PathVariable int id) {
        khuyenMaiService.delete(id);
        return "redirect:/khuyenmai";
    }
}
