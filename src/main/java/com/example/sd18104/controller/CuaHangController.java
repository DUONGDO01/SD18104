package com.example.sd18104.controller;

import com.example.sd18104.request.CuaHangRequest;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    public ArrayList<CuaHangRequest> cuahang;

    public CuaHangController() {
        this.cuahang = new ArrayList<>();
        cuahang.add(new CuaHangRequest("ch01", "Shopppe", "Nam Tu Liem", "Ha Noi", "VietNam"));
        cuahang.add(new CuaHangRequest("ch02", "Grap", "Nam Tu Liem", "Ha Noi", "VietNam"));
        cuahang.add(new CuaHangRequest("ch03", "Lazada", "Nam Tu Liem", "Ha Noi", "VietNam"));


    }

    @GetMapping("index")
    public String index(Model model) {
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
        cuahang.add(request);
        return "redirect:/cua-hang/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, CuaHangRequest request) {
        for (int i = 0; i < this.cuahang.size(); i++) {
            CuaHangRequest ch = this.cuahang.get(i);
            if (ch.getMa().equals(ma)) {
                this.cuahang.remove(i);
                break;
            }
        }
        return "redirect:/cua-hang/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        for (int i = 0; i < this.cuahang.size(); i++) {
            CuaHangRequest ch = this.cuahang.get(i);
            if (ch.getMa().equals(ma)) {
                m.addAttribute("cuahang", ch);
                break;
            }
        }
        return "CuaHang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, CuaHangRequest request) {
        for (int i = 0; i < this.cuahang.size(); i++) {
            CuaHangRequest ch = this.cuahang.get(i);
            if (ch.getMa().equals(ma)) {
                this.cuahang.set(i, request);
                break;
            }
        }
        return "redirect:/cua-hang/index";
    }
}
