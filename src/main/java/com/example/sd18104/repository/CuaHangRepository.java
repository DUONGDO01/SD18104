package com.example.sd18104.repository;

import com.example.sd18104.Entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {

    @Query("select obj from CuaHang obj where obj.ma =?1")
    public CuaHang findByMa(String ma);
}
