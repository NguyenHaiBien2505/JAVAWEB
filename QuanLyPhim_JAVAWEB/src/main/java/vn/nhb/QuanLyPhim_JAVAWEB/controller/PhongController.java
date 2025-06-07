package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phong;
import vn.nhb.QuanLyPhim_JAVAWEB.service.PhongService;
import vn.nhb.QuanLyPhim_JAVAWEB.service.RapService; // Để lấy danh sách rạp khi cần

@Controller
@RequestMapping("/phong")
public class PhongController {

    @Autowired
    private PhongService phongService;

    @Autowired
    private RapService rapService; // Giả sử bạn đã có RapService

    @GetMapping
    public String listPhong(Model model) {
        model.addAttribute("phongList", phongService.getAll());
        model.addAttribute("rapList", rapService.getAllRap()); // Lấy danh sách rạp
        return "phong"; // tên view HTML
    }

    @PostMapping("/add")
    public String addPhong(@ModelAttribute Phong phong) {
        phongService.add(phong);
        return "redirect:/phong";
    }

    @PostMapping("/update")
    public String updatePhong(@ModelAttribute Phong phong) {
        phongService.update(phong);
        return "redirect:/phong";
    }

    @PostMapping("/delete/{id}")
    public String deletePhong(@PathVariable int id) {
        phongService.delete(id);
        return "redirect:/phong";
    }
}
