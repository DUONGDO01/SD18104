package com.example.sd18104.Entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;


}
