package com.example.sd18104.controller;

import com.example.sd18104.Entity.ChiTietSp;
import com.example.sd18104.repository.ChiTietSpRepository;
import com.example.sd18104.request.ChiTietSanPhamRequest;
import com.example.sd18104.request.CuaHangRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("chi-tiet-sp")
public class ChiTietSPController {

    @Autowired
    private ChiTietSpRepository repository;
    public List<ChiTietSp> ctsp;

    public ChiTietSPController() {
        this.ctsp = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.ctsp = this.repository.findAll();
        model.addAttribute("chitietsp", ctsp);
        return "/ChiTietSP/index";
    }

    //create
    @GetMapping("create")
    public String create(@ModelAttribute("chitietsp") ChiTietSanPhamRequest request) {
        return "/ChiTietSP/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("chitietsp") ChiTietSanPhamRequest request, BindingResult result) {
        ChiTietSp ct = new ChiTietSp();
        ct.setMoTa(request.getMoTa());
        ct.setNamBh(request.getNamBh());
        ct.setSoLuongTon(request.getSoLuongTon());
        ct.setGiaBan(request.getGiaBan());
        ct.setGiaNhap(request.getGiaNhap());
        this.repository.save(ct);
        return "redirect:/chi-tiet-sp/index";
    }

    //delete
    @GetMapping("delete/{idSP}")
    public String delete(@PathVariable("id") UUID id, ChiTietSanPhamRequest request) {

        return "redirect:/chi-tiet-sp/index";
    }

    //update
    @GetMapping("edit/{idSP}")
    public String edit(@PathVariable("idSP") String idSP, Model model) {

        return "/ChiTietSP/edit";
    }

    @PostMapping("update/{idSP}")
    public String update(@PathVariable("idSP") String idSP, ChiTietSanPhamRequest request) {

        return "redirect:/chi-tiet-sp/index";
    }

}
