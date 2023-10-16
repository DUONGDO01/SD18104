package com.example.sd18104.repository;

import com.example.sd18104.Entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
    @Query("select obj from ChucVu obj where obj.ma =?1")
    public ChucVu findByMa(String ma);
}
