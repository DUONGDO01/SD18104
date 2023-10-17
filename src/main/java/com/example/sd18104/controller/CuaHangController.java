package com.example.sd18104.controller;

import com.example.sd18104.Entity.CuaHang;
import com.example.sd18104.repository.CuaHangRepository;
import com.example.sd18104.request.CuaHangRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    @Autowired
    private CuaHangRepository repository;

    public List<CuaHang> cuahang;

    public CuaHangController() {
        this.cuahang = new ArrayList<>();


    }

    @GetMapping("index")
    public String index(Model model) {
        this.cuahang = this.repository.findAll();
        model.addAttribute("cuahang", cuahang);
        return "/CuaHang/index";
    }

    //create
    @GetMapping("create")
    public String create(@ModelAttribute("cuahang") CuaHangRequest request) {
        return "CuaHang/create";
    }

    @PostMapping("store")
    public String Store(@Valid @ModelAttribute("cuahang") CuaHangRequest request, BindingResult result) {
        CuaHang ch = new CuaHang();
        ch.setMa(request.getMa());
        ch.setTen(request.getTen());
        ch.setDiaChi(request.getDiaChi());
        ch.setThanhPho(request.getThanhPho());
        ch.setQuocGia(request.getQuocGia());
        this.repository.save(ch);
        return "redirect:/cua-hang/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, CuaHangRequest request) {
        CuaHang ch = this.repository.findByMa(ma);
        this.repository.delete(ch);
        return "redirect:/cua-hang/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        CuaHang ch = this.repository.findByMa(ma);
        m.addAttribute("cuahang", ch);
        return "CuaHang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, CuaHangRequest request) {
        CuaHang find = this.repository.findByMa(ma);
        CuaHang ch = new CuaHang();
        ch.setId(find.getId());
        ch.setMa(request.getMa());
        ch.setTen(request.getTen());
        ch.setDiaChi(request.getDiaChi());
        ch.setThanhPho(request.getThanhPho());
        ch.setQuocGia(request.getQuocGia());
        this.repository.save(ch);
        return "redirect:/cua-hang/index";
    }
}
