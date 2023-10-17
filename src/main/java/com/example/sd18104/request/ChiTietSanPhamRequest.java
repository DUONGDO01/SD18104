package com.example.sd18104.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSanPhamRequest {

//    private UUID idSp;
//
//    private UUID idNsx;
//
//    private UUID idMauSac;
//
//    private UUID idDongSp;

    private Integer namBh;

    private String moTa;

    private Integer soLuongTon;

    private BigDecimal giaNhap;

    private BigDecimal giaBan;
}
