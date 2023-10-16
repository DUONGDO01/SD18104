package com.example.sd18104.controller;

import com.example.sd18104.Entity.Nsx;
import com.example.sd18104.repository.NsxRepository;
import com.example.sd18104.request.NhaSXRequest;
import com.example.sd18104.request.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("nha-san-xuat")
public class NhaSanXuatController {

    @Autowired
    private NsxRepository repository;

    public List<Nsx> nhaSX;

    public NhaSanXuatController() {
        this.nhaSX = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.nhaSX = repository.findAll();
        model.addAttribute("data", this.nhaSX);
        return "NhaSanXuat/index";
    }

    //them
    @GetMapping("create")
    public String create(@ModelAttribute("nsx") NhaSXRequest request) {

        return "/NhaSanXuat/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nsx") NhaSXRequest request, BindingResult result) {
        Nsx nsx = new Nsx();
        nsx.setMa(request.getMa());
        nsx.setTen(request.getTen());
        this.repository.save(nsx);
        return "redirect:/nha-san-xuat/index";
    }

    //sua
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        Nsx nsx = this.repository.findByMa(ma);
        m.addAttribute("nsx", nsx);
        return "/NhaSanXuat/store";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, NhaSXRequest request) {

        Nsx find = this.repository.findByMa(ma);
        Nsx nsx = new Nsx();
        nsx.setId(find.getId());
        nsx.setMa(request.getMa());
        nsx.setTen(request.getTen());
        this.repository.save(nsx);
        return "redirect:/nha-san-xuat/index";
    }

    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma) {
        Nsx nsx = this.repository.findByMa(ma);
        this.repository.delete(nsx);
        return "redirect:/nha-san-xuat/index";
    }
}
