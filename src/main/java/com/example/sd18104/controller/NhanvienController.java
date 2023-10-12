package com.example.sd18104.controller;

import com.example.sd18104.Entity.NhanVien;
import com.example.sd18104.repository.NhanVienRepository;
import com.example.sd18104.request.NhanVienRequest;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("nhan-vien")
public class NhanvienController {


    private List<NhanVien> ds;

    @Autowired
    private NhanVienRepository repository;

    public NhanvienController() {
        this.ds = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.ds = this.repository.findAll();
        model.addAttribute("data", this.ds);
        return "/NhanVien/index";
    }

    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maNV) {
        NhanVien nv = this.repository.findByMa(maNV);
        this.repository.delete(nv);
        return "redirect:/nhan-vien/index";
    }


    //them
    @GetMapping("create")
    public String formCreate(@ModelAttribute("nv") NhanVienRequest req, Model model) {

        return "/NhanVien/create";
    }

    @PostMapping("store")
    public String Store(@Valid @ModelAttribute("nv") NhanVienRequest req, BindingResult result) {

        NhanVien nv = new NhanVien();
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTen(req.getTen());
        nv.setTenDem(req.getTenDem());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());

        this.repository.save(nv);
        return "redirect:/nhan-vien/index";
    }

    //sua
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        NhanVien nv = this.repository.findByMa(ma);
        m.addAttribute("nv", nv);


        return "/NhanVien/store";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, NhanVienRequest req) {
        NhanVien find = this.repository.findByMa(ma);
        NhanVien nv = new NhanVien();
        nv.setId(find.getId());
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTen(req.getTen());
        nv.setTenDem(req.getTenDem());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());
        this.repository.save(nv);

        return "redirect:/nhan-vien/index";
    }

    @ModelAttribute("gioitinh")
    public Map<Integer, String> getGender() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Nam");
        map.put(1, "Nữ");
        return map;
    }
}
