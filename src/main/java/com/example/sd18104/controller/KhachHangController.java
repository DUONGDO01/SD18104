package com.example.sd18104.controller;

import com.example.sd18104.request.KhachHangRequest;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    public ArrayList<KhachHangRequest> khachhang;

    public KhachHangController() {
//        String dateString = null;
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            Date date = dateFormat.parse(dateString);
//        }catch (ParseException e){
//        }
        LocalDate myObj = LocalDate.now();
        this.khachhang = new ArrayList<>();
//        khachhang.add(new KhachHangRequest("KH01","Văn","ĐỖ","Dương",myObj,"0987654321","Bạch Thượng","Hà Nam","Việt Nam","****"));
//        khachhang.add(new KhachHangRequest("KH02","Văn","ĐỖ","Dương",myObj,"0987654321","Bạch Thượng","Hà Nam","Việt Nam","****"));
//        khachhang.add(new KhachHangRequest("KH03","Văn","ĐỖ","Dương",myObj,"0987654321","Bạch Thượng","Hà Nam","Việt Nam","****"));
    }

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("khachhang", khachhang);
        return "/KhachHang/index";
    }

    //create
    @GetMapping("create")
    public String khachHang(@ModelAttribute("khachhang") KhachHangRequest request) {
        {
            return "KhachHang/create";
        }
    }

    @PostMapping("store")
    public String khachHangStore(@Valid @ModelAttribute("khachhang") KhachHangRequest request, BindingResult result
    ) {
        khachhang.add(request);
        System.out.println("Thêm mới thành công\nMã: " + request.getMa() + "" +
                        "\nTên: " + request.getTen()
//                "\nTên đệm:" + tendem +
//                "\nHọ: "+ ho+
//                "\nNgay Sinh:" +ngaysinh+
//                "\nSĐT: "+sdt +
//                "\nĐịa Chỉ: "+diachi+
//                "\nThanh Phố: "+thanhpho+
//                "\nQuoc Gia: "+quocgia+
//                "\nMat Khẩu: "+matkhau
        );
        return "redirect:/khach-hang/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma) {
        for (int i = 0; i < this.khachhang.size(); i++) {
            KhachHangRequest kh = this.khachhang.get(i);
            if (kh.getMa().equals(ma)) {
                this.khachhang.remove(i);
                break;
            }
        }
        return "redirect:/khach-hang/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        for (int i = 0; i < this.khachhang.size(); i++) {
            KhachHangRequest kh = this.khachhang.get(i);
            if (kh.getMa().equals(ma)) {
                m.addAttribute("khachhang", kh);
                break;
            }
        }
        return "KhachHang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, KhachHangRequest request) {
        for (int i = 0; i < this.khachhang.size(); i++) {
            KhachHangRequest kh = this.khachhang.get(i);
            if (kh.getMa().equals(ma)) {
                this.khachhang.set(i, request);
                break;
            }
        }
        return "redirect:/khach-hang/index";
    }
}
