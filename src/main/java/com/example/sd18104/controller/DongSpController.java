package com.example.sd18104.controller;

import com.example.sd18104.Entity.DongSp;
import com.example.sd18104.repository.DongSpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("Dong-SP")
public class DongSpController {
    @Autowired
    private DongSpRepository repository;

    public List<DongSp> dongsp;

    public DongSpController (){
        this.dongsp = new ArrayList<>();

    }
    @GetMapping("index")
    public String index(Model model){
        this.dongsp = repository.findAll();
        model.addAttribute("dongsp",dongsp);
return "DongSP/index";
    }
}
