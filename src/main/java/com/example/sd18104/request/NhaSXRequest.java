package com.example.sd18104.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NhaSXRequest {
    @NotBlank
    private String ma;
    @NotBlank
    private String ten;

}
