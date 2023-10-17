package com.example.sd18104.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

//    @Column(name = "IdSP")
//    private UUID idSp;
//
//    @Column(name = "IdNsx")
//    private UUID idNsx;
//
//    @Column(name = "IdMauSac")
//    private UUID idMauSac;
//
//    @Column(name = "IdDongSP")
//    private UUID idDongSp;

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
