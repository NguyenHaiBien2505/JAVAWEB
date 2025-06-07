package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.LoaiGhe;
import vn.nhb.QuanLyPhim_JAVAWEB.service.LoaiGheService;

@Controller
@RequestMapping("/loaighe")
public class LoaiGheController {

    @Autowired
    private LoaiGheService loaiGheService;

    @GetMapping
    public String listLoaiGhe(Model model) {
        model.addAttribute("loaiGheList", loaiGheService.getAll());
        return "loaighe"; // tên view html quản lý loại ghế
    }

    @PostMapping("/add")
    public String addLoaiGhe(@ModelAttribute LoaiGhe loaiGhe) {
        loaiGheService.add(loaiGhe);
        return "redirect:/loaighe";
    }

    @PostMapping("/update")
    public String updateLoaiGhe(@ModelAttribute LoaiGhe loaiGhe) {
        loaiGheService.update(loaiGhe);
        return "redirect:/loaighe";
    }

    @PostMapping("/delete/{id}")
    public String deleteLoaiGhe(@PathVariable int id) {
        loaiGheService.delete(id);
        return "redirect:/loaighe";
    }
}
