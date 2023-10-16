package com.example.sd18104.repository;

import com.example.sd18104.Entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, UUID> {
    @Query("select obj from SanPham obj  where obj.ma = ?1")
    public SanPham findByMa(String ma);
}
