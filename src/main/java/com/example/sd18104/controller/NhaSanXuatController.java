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
     public NhaSanXuatController(){
         this.nhaSX= new ArrayList<>();
//         nhaSXRequests.add(new NhaSXRequest("Nha01","Ngoc Anh"));
//         nhaSXRequests.add(new NhaSXRequest("Nha02","Duong Do"));
     }
     @GetMapping("index")
    public String index(Model model){
         this.nhaSX = repository.findAll();
         model.addAttribute("data",this.nhaSX);
         return "NhaSanXuat/index";
     }
     //them
     @GetMapping("create")
    public String create( @ModelAttribute("nsx") NhaSXRequest request){

         return "/NhaSanXuat/create";
     }
     @PostMapping("store")
    public String store(@Valid @ModelAttribute("nsx") NhaSXRequest request,BindingResult result){
//         System.out.println(request.getMa());
//         System.out.println(request.getTen());
//         nhaSXRequests.add(request);
         return "redirect:/nha-san-xuat/index";
     }

    //sua
     @GetMapping("edit/{ma}")
    public String edti(@PathVariable("ma") String ma ,Model m){
//         for(int i = 0; i<this.nhaSXRequests.size();i++){
//             NhaSXRequest nv = this.nhaSXRequests.get(i);
//             if (nv.getMa().equals(ma)){
//                 m.addAttribute("nsx",nv);
//             }
//         }
         return "/NhaSanXuat/store";
     }
     @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma , NhaSXRequest request){
//         for (int i = 0;i<this.nhaSXRequests.size();i++){
//             NhaSXRequest nsx = this.nhaSXRequests.get(i);
//             if (nsx.getMa().equals(ma)){
//                 this.nhaSXRequests.set(i,request);
//                 break;
//             }
//         }
         return "redirect:/nha-san-xuat/index";
     }
     //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
//         for (int i =0 ;i<this.nhaSXRequests.size();i++){
//             NhaSXRequest nsx = this.nhaSXRequests.get(i);
//             if(nsx.getMa().equals(ma)){
//                 this.nhaSXRequests.remove(i);
//                 break;
//             }
//         }
         return "redirect:/nha-san-xuat/index";
    }
}
