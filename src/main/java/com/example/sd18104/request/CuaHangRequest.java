package com.example.sd18104.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CuaHangRequest {

    private String ma;

    private String ten;

    private String diaChi;

    private String thanhPho;

    private String quocGia;

}
