package vn.nhb.QuanLyPhim_JAVAWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.nhb.QuanLyPhim_JAVAWEB.entity.Rap;
import vn.nhb.QuanLyPhim_JAVAWEB.service.RapService;

import java.util.List;

@Controller
@RequestMapping("/rap")
public class RapController {
    @Autowired
    private RapService rapService;
    @GetMapping
    public String getAllRap(Model model) {
         // Thêm danh sách rạp vào model để hiển thị trong view
         List<Rap> list = rapService.getAllRap();
         model.addAttribute("rapList", list);
         model.addAttribute("rap", new Rap()); // Để sử dụng trong form thêm mới
        return "rap"; // Giả sử bạn có một view tên là "rap/list"
    }
    // Các phương thức khác như thêm, sửa, xóa rạp có thể được thêm vào đây

    @PostMapping("/add")
    public String addRap(@ModelAttribute Rap rap) {
        rapService.saveRap(rap);
        return "redirect:/rap"; // Quay lại trang danh sách rạp sau khi thêm
    }
    @PostMapping("/update")
    public String updateRap(@ModelAttribute Rap rap) {
        rapService.updateRap(rap);
        return "redirect:/rap"; // Quay lại trang danh sách rạp sau khi cập nhật
    }
    @PostMapping("/delete/{maRap}")
    public String deleteRap(@PathVariable("maRap") int maRap) {
        rapService.deleteRap(maRap);
        return "redirect:/rap"; // Quay lại trang danh sách rạp sau khi xóa
    }
}
