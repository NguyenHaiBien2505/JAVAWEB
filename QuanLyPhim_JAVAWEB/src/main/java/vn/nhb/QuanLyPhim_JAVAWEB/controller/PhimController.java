package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Phim;
import vn.nhb.QuanLyPhim_JAVAWEB.service.PhimService;

import java.util.List;

@Controller
@RequestMapping("/phim")
public class PhimController {
    private final PhimService phimService;

    @Autowired
    public PhimController(PhimService phimService) {
        this.phimService = phimService;
    }

    @GetMapping
    public String getAllPhim(Model model) {
        List<Phim> list = phimService.getAllPhim();
        model.addAttribute("phimList", list);
        model.addAttribute("phim", new Phim()); // Cho form thêm mới
        return "phim/list";
    }

    @PostMapping("/add")
    public String addPhim(@ModelAttribute Phim phim) {
        phimService.savePhim(phim);
        return "redirect:/phim";
    }

    @PostMapping("/update/{id}")
    public String updatePhim(@ModelAttribute Phim phim,@PathVariable  int id) {
        phimService.updatePhim(phim);
        return "redirect:/phim";
    }

    @PostMapping("/delete/{maPhim}")
    public String deletePhim(@PathVariable("maPhim") int id) {
        phimService.deletePhim(id);
        return "redirect:/phim";
    }
}