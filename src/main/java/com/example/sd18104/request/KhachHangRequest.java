package com.example.sd18104.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhachHangRequest {
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
//    @Future
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate ngaySinh ;
    private String sdt;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private String matKhau;

}
