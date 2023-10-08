package com.example.sd18104.controller;

import com.example.sd18104.request.SanPhamRequest;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@Controller
@RequestMapping("san-pham")
@Configuration
public class SanPhamController {
    public ArrayList<SanPhamRequest> sanpham;
    public SanPhamController(){
        this.sanpham = new ArrayList<>();
        sanpham.add(new SanPhamRequest("SP01","SamSungS21"));
        sanpham.add(new SanPhamRequest("SP02","SamSungS22"));
        sanpham.add(new SanPhamRequest("SP03","SamSungS23"));
    }
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("sanpham",sanpham);
        return "SanPham/index";
    }
    //create
    @GetMapping("create")
    public String index(@ModelAttribute("sanpham") SanPhamRequest request){
        return "SanPham/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("sanpham") SanPhamRequest request, BindingResult result){
       this.sanpham.add(request);
        return "redirect:/san-pham/index";
    }
    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, SanPhamRequest request){
        for (int i = 0;i<this.sanpham.size();i++){
            SanPhamRequest sp = this.sanpham.get(i);
            if (sp.getMa().equals(ma)){
                sanpham.remove(i);
                break;
            }
        }
        return "redirect:/san-pham/index";
    }
    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,Model model, SanPhamRequest request){
        for (int i = 0;i<this.sanpham.size();i++){
            SanPhamRequest sp = this.sanpham.get(i);
            if (sp.getMa().equals(ma)){
               model.addAttribute("sanpham" ,sp);
                break;
            }
        }
        return "SanPham/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma,Model model, SanPhamRequest request){
        for (int i = 0;i<this.sanpham.size();i++){
            SanPhamRequest sp = this.sanpham.get(i);
            if (sp.getMa().equals(ma)){
               this.sanpham.set(i,request);
                break;
            }
        }
        return "redirect:/san-pham/index";
    }
}
