package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Taikhoan;
import vn.nhb.QuanLyPhim_JAVAWEB.service.TaiKhoanService;

import java.util.List;

@Controller
@RequestMapping("/taikhoan")
public class TaiKhoanController {
    @Autowired
     private TaiKhoanService taiKhoanService;
    @GetMapping
    public String getAllTaiKhoan(Model model) {
        // Lấy danh sách tài khoản từ service
        List<Taikhoan> taikhoanList = taiKhoanService.getAllTaiKhoan();
        System.out.println("Danh sách tài khoản: " + taikhoanList);
        // Thêm danh sách tài khoản vào model để hiển thị trong view
        model.addAttribute("taiKhoanList", taikhoanList);
        model.addAttribute("taikhoan", new Taikhoan());
        // Trả về view hiển thị danh sách tài khoản
        return "taikhoan";
    }
    @PostMapping("/add")
    public String addTaiKhoan(@ModelAttribute Taikhoan taikhoan) {
        // Gọi service để thêm tài khoản mới
        taiKhoanService.saveTaiKhoan(taikhoan);
        // Quay lại trang danh sách tài khoản sau khi thêm
        return "redirect:/taikhoan";
    }
    @PostMapping("/update")
    public String updateTaiKhoan(@ModelAttribute Taikhoan taikhoan) {
        // Gọi service để cập nhật tài khoản
        taiKhoanService.updateTaiKhoan(taikhoan);
        // Quay lại trang danh sách tài khoản sau khi cập nhật
        return "redirect:/taikhoan";
    }
    @PostMapping("/delete/{mtk}")
    public String deleteTaiKhoan(@PathVariable("mtk") int mtk) {
        // Gọi service để xóa tài khoản
        taiKhoanService.deleteTaiKhoan(mtk);
        // Quay lại trang danh sách tài khoản sau khi xóa
        return "redirect:/taikhoan";
    }
}
