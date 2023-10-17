package com.example.sd18104.controller;

import com.example.sd18104.Entity.KhachHang;
import com.example.sd18104.repository.KhachHangRepository;
import com.example.sd18104.request.KhachHangRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {

    public List<KhachHang> khachhang;

    @Autowired
    private KhachHangRepository repository;


    public KhachHangController() {
//        String dateString = null;
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate myObj = LocalDate.now();
        this.khachhang = new ArrayList<>();
    }

    //form
    @GetMapping("index")
    public String index(Model model) {
        this.khachhang = this.repository.findAll();
        model.addAttribute("khachhang", khachhang);
        return "/KhachHang/index";
    }

    //create
    @GetMapping("create")
    public String create(@ModelAttribute("khachhang") KhachHangRequest request) {
        return "KhachHang/create";
    }

    @PostMapping("store")
    public String khachHangStore(@Valid @ModelAttribute("khachhang") KhachHangRequest request, BindingResult result
    ) {
        KhachHang kh = new KhachHang();
        LocalDate currentDate = LocalDate.of(1990, 1, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = currentDate.format(formatter);
        kh.setMa(request.getMa());
        kh.setTen(request.getTen());
        kh.setTenDem(request.getTenDem());
        kh.setHo(request.getHo());
        kh.setNgaySinh(request.getNgaySinh());
        kh.setSdt(request.getSdt());
        kh.setDiaChi(request.getDiaChi());
        kh.setThanhPho(request.getThanhPho());
        kh.setQuocGia(request.getQuocGia());
        kh.setMatKhau(request.getMatKhau());
        this.repository.save(kh);

        return "redirect:/khach-hang/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma) {
        KhachHang kh = this.repository.findByMa(ma);
        this.repository.delete(kh);
        return "redirect:/khach-hang/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        KhachHang kh = this.repository.findByMa(ma);
        m.addAttribute("khachhang", kh);
        return "KhachHang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, KhachHangRequest request) {
        KhachHang find = this.repository.findByMa(ma);
        KhachHang kh = new KhachHang();
        LocalDate currentDate = LocalDate.of(1990, 1, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = currentDate.format(formatter);
        kh.setId(find.getId());
        kh.setMa(request.getMa());
        kh.setTen(request.getTen());
        kh.setTenDem(request.getTenDem());
        kh.setHo(request.getHo());
        kh.setNgaySinh(request.getNgaySinh());
        kh.setSdt(request.getSdt());
        kh.setDiaChi(request.getDiaChi());
        kh.setThanhPho(request.getThanhPho());
        kh.setQuocGia(request.getQuocGia());
        kh.setMatKhau(request.getMatKhau());
        this.repository.save(kh);
        return "redirect:/khach-hang/index";
    }
}
