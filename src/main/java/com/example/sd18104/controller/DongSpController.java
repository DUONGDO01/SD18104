package com.example.sd18104.controller;

import com.example.sd18104.Entity.DongSp;
import com.example.sd18104.repository.DongSpRepository;
import com.example.sd18104.request.DongSpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("Dong-SP")
public class DongSpController {


    @Autowired
    private DongSpRepository repository;

    public List<DongSp> dongsp;

    public DongSpController() {
        this.dongsp = new ArrayList<>();

    }

    @GetMapping("index")
    public String index(Model model) {
        this.dongsp = repository.findAll();
        model.addAttribute("dongsp", dongsp);
        return "DongSP/index";
    }
    //thêm
    @GetMapping("create")
    public String create(@ModelAttribute("dongsp") DongSpRequest req  ){
        return "/DongSP/create";

    }
    @PostMapping("store")
    public String store(@ModelAttribute("dongsp") DongSpRequest req , BindingResult result){
        DongSp sp = new DongSp();
        sp.setMa(req.getMa());
        sp.setTen(req.getTen());
        this.repository.save(sp);
        return "redirect:/Dong-SP/index";
    }
    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
        DongSp sp = this.repository.findByMa(ma);
        this.repository.delete(sp);
        return "redirect:/Dong-SP/index";
    }
    //form update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,Model model){
        DongSp sp = this.repository.findByMa(ma);
        model.addAttribute("dongsp",sp);
        return "/DongSP/store";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma , DongSpRequest request){
        DongSp find = this.repository.findByMa(ma);
        DongSp sp = new DongSp();
        sp.setId(find.getId());
        sp.setMa(request.getMa());
        sp.setTen(request.getTen());
        this.repository.save(sp);
        return "redirect:/Dong-SP/index";
    }

}
