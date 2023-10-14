package com.example.sd18104.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table (name = "ChiTietSP")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSp {
    @Id
    @Column(name = "Id")
    private UUID id;

//    @Column(name = "IdSP")
//    private null idSp;
//
//    @Column(name = "IdNsx")
//    private null idNsx;
//
//    @Column(name = "IdMauSac")
//    private null idMauSac;
//
//    @Column(name = "IdDongSP")
//    private null idDongSp;

    @Column(name = "NamBH")
    private Integer namBh;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;

}
