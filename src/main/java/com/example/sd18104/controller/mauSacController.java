package com.example.sd18104.controller;

import com.example.sd18104.request.mauSacRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("mau-sac")
public class mauSacController {
    private ArrayList<mauSacRequest> ds;

    public mauSacController() {
        this.ds = new ArrayList<>();
//        ds.add(new mauSacRequest("MM01", "NSX"));
//        ds.add(new mauSacRequest("MM02", "NSX"));
    }

    @GetMapping("index")
    public String index(Model model) {
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
        System.out.println(request.getMa());
        System.out.println(request.getTen());
        ds.add(request);
        return "redirect:/mau-sac/index";
    }

    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maMS) {
        for (int i = 0; i < this.ds.size(); i++) {
            mauSacRequest mau = this.ds.get(i);
            if (mau.getMa().equals(maMS)) {
                this.ds.remove(i);
                break;
            }
        }
        return "redirect:/mau-sac/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        for (int i = 0; i < this.ds.size(); i++) {
            mauSacRequest request = this.ds.get(i);
            if (request.getMa().equals(ma)) {
                m.addAttribute("mau", request);
                break;
            }
        }
        return "/mauSac/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, mauSacRequest request) {
        for (int i = 0; i < this.ds.size(); i++) {
            mauSacRequest ms = this.ds.get(i);
            if (ms.getMa().equals(ma)) {
                this.ds.set(i, request);
                break;
            }
        }
        return "redirect:/mau-sac/index";
    }
}
