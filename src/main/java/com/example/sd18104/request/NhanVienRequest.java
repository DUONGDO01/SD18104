package com.example.sd18104.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NhanVienRequest {
    @NotBlank(message = "không được để trống ")
    private String ma;
    @NotBlank(message = "không được để trống ")
    private String ten;
@NotBlank(message = "không được để trống ")
    private String tendem;
    @NotBlank
    private String ho;
    @NotNull
    private Integer gioitinh;

    private String ngaysinh;
    @NotBlank
    private String diachi;
    @NotBlank
    private String dienthoai;
    @NotBlank
    private String pass;
    @NotNull
    private boolean trangthai;
}
