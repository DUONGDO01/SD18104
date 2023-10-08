package com.example.sd18104.controller;

import com.example.sd18104.request.ChiTietSanPhamRequest;
import com.example.sd18104.request.CuaHangRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("chi-tiet-sp")
public class ChiTietSPController {
    public ArrayList<ChiTietSanPhamRequest> ctsp;
    public ChiTietSPController(){
        this.ctsp = new ArrayList<>();
        ctsp.add(new ChiTietSanPhamRequest("SP01","NV01","Đỏ","DongSP01",2020,"Xuất nhập khẩu đẹp",12,19.000,29.999));
        ctsp.add(new ChiTietSanPhamRequest("SP02","NV02","Đỏ","DongSP03",2020,"Xuất nhập khẩu đẹp",12,19.000,29.999));
        ctsp.add(new ChiTietSanPhamRequest("SP03","NV03","Đỏ","DongSP01",2020,"Xuất nhập khẩu đẹp",12,19.000,29.999));
    }
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("chitietsp",ctsp);
        return "/ChiTietSP/index";
    }
    //create
    @GetMapping("create")
    public String create(@ModelAttribute("chitietsp") ChiTietSanPhamRequest request){
        return "/ChiTietSP/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("chitietsp") ChiTietSanPhamRequest request , BindingResult result){
        ctsp.add(request);
        return "redirect:/chi-tiet-sp/index";
    }
    //delete
    @GetMapping("delete/{idSP}")
    public String delete(@PathVariable("idSP") String idSP , ChiTietSanPhamRequest request){
        for (int i =0; i<this.ctsp.size();i++){
            ChiTietSanPhamRequest sp = this.ctsp.get(i);
            if(sp.getIdSP().equals(idSP)){
                this.ctsp.remove(i);
                break;
            }
        }
        return "redirect:/chi-tiet-sp/index";
    }
    //update
    @GetMapping("edit/{idSP}")
    public String edit(@PathVariable("idSP") String idSP,Model model){
        for (int i=0;i<this.ctsp.size();i++){
            ChiTietSanPhamRequest sp = this.ctsp.get(i);
            if(sp.getIdSP().equals(idSP)){
                model.addAttribute("chitietsp",sp);
                break;
            }
        }
        return "/ChiTietSP/edit";
    }
    @PostMapping("update/{idSP}")
    public String update(@PathVariable("idSP") String idSP, ChiTietSanPhamRequest request){
        for (int i = 0; i<this.ctsp.size();i++){
            ChiTietSanPhamRequest sp = this.ctsp.get(i);
            if (sp.getIdSP().equals(idSP)){
                this.ctsp.set(i,request);
                break;
            }
        }
        return "redirect:/chi-tiet-sp/index";
    }

}
