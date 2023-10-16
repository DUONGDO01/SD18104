package com.example.sd18104.controller;

import com.example.sd18104.Entity.MauSac;
import com.example.sd18104.repository.MauSacRepository;
import com.example.sd18104.request.mauSacRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class mauSacController {
    @Autowired
    private MauSacRepository repository;
    private List<MauSac> ds;

    public mauSacController() {
        this.ds = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.ds = this.repository.findAll();
        model.addAttribute("data", this.ds);
        return "mauSac/index";
    }

    //them
    @GetMapping("create")
    public String create(@ModelAttribute("mau") mauSacRequest request) {

        return "mauSac/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("mau") mauSacRequest request, BindingResult result) {
        MauSac ms = new MauSac();
        ms.setMa(request.getMa());
        ms.setTen(request.getTen());
        this.repository.save(ms);
        return "redirect:/mau-sac/index";
    }

    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maMS) {
        MauSac ms = this.repository.findByMa(maMS);
        this.repository.delete(ms);
        return "redirect:/mau-sac/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        MauSac ms = this.repository.findByMa(ma);
        m.addAttribute("mau", ms);
        return "/mauSac/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, mauSacRequest request) {
        MauSac ms = this.repository.findByMa(ma);
        MauSac mausac = new MauSac();
        mausac.setId(ms.getId());
        mausac.setMa(request.getMa());
        mausac.setTen(request.getTen());
        this.repository.save(mausac);
        return "redirect:/mau-sac/index";
    }
}
