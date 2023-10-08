package com.example.sd18104.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class mauSacRequest {
    @NotBlank
    private String ma;
    @NotBlank
    private String ten;
}
