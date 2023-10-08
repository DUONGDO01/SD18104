package com.example.sd18104.controller;

import com.example.sd18104.request.ChucVuRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("chuc-vu")
public class ChucVuController {
    public ArrayList<ChucVuRequest> chucvu;
    public ChucVuController(){
        this.chucvu = new ArrayList<>();
        chucvu.add(new ChucVuRequest("CH01","Duong"));
        chucvu.add(new ChucVuRequest("CH02","Minh"));
        chucvu.add(new ChucVuRequest("CH013","Quyen"));
    }
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("chucvu",chucvu);
        return "ChucVu/index";
    }
    //create
    @GetMapping("create")
    public String create(@ModelAttribute("chucvu") ChucVuRequest request){

        return "ChucVu/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("chucvu") ChucVuRequest request, BindingResult result){
        chucvu.add(request);
        return "redirect:/chuc-vu/index";
    }
    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma")  String ma){
        for (int i = 0 ;i<this.chucvu.size();i++){
            ChucVuRequest cv = this.chucvu.get(i);
            if (cv.getMa().equals(ma)){
                this.chucvu.remove(i);
                break;
            }
        }
        return "redirect:/chuc-vu/index";
    }
    //Update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma")String ma,Model m){
        for (int i=0;i<this.chucvu.size();i++){
            ChucVuRequest cv = this.chucvu.get(i);
            if(cv.getMa().equals(ma)){
                m.addAttribute("chucvu",cv);
            }
        }
        return "ChucVu/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, ChucVuRequest request){
        for (int i=0; i<this.chucvu.size();i++){
            ChucVuRequest cv = this.chucvu.get(i);
            if (cv.getMa().equals(ma)){
                this.chucvu.set(i,request);
                break;

            }
        }
        return "redirect:/chuc-vu/index";
    }
}
