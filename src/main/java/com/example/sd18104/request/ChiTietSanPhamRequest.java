package com.example.sd18104.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSanPhamRequest {

    private String idSP;

    private String idNsx;

    private String idMauSac;

    private String idDongSP;

    private Integer namBH;

    private String moTa;

    private Integer soLuongTon;

    private Double giaNhap;

    private Double giaBan;
}
