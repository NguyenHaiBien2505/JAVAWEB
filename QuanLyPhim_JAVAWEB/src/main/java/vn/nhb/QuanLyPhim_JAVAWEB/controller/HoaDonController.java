package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.HoaDon;
import vn.nhb.QuanLyPhim_JAVAWEB.service.HoaDonService;
import vn.nhb.QuanLyPhim_JAVAWEB.service.TaiKhoanService;
import vn.nhb.QuanLyPhim_JAVAWEB.service.KhuyenMaiService;

@Controller
@RequestMapping("/hoadon")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private TaiKhoanService taiKhoanService;

    @Autowired
    private KhuyenMaiService khuyenMaiService;

    @GetMapping
    public String listHoaDon(Model model) {
        model.addAttribute("hoaDonList", hoaDonService.getAllHoaDon());
        model.addAttribute("taiKhoanList", taiKhoanService.getAllTaiKhoan());
        model.addAttribute("khuyenMaiList", khuyenMaiService.getAll());
        return "hoadon.html";
    }

    @PostMapping("/add")
    public String addHoaDon(@ModelAttribute HoaDon hoaDon) {
        hoaDonService.saveHoaDon(hoaDon);
        return "redirect:/hoadon";
    }

    @PostMapping("/update")
    public String updateHoaDon(@ModelAttribute HoaDon hoaDon) {
        hoaDonService.updateHoaDon(hoaDon);
        return "redirect:/hoadon";
    }

    @PostMapping("/delete/{id}")
    public String deleteHoaDon(@PathVariable int id) {
        hoaDonService.deleteHoaDon(id);
        return "redirect:/hoadon";
    }
}
