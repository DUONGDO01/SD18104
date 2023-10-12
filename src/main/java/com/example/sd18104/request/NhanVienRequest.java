package com.example.sd18104.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NhanVienRequest {

    private UUID id;

    private String ma;

    private String ten;

    private String tenDem;

    private String ho;

    private String gioiTinh;

    private String ngaySinh;

    private String diaChi;

    private String sdt;

    private String matKhau;

    private UUID idCh;

    private UUID idCv;

    private UUID idGuiBc;

    private Integer trangThai;
}
