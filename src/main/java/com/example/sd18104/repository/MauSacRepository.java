package com.example.sd18104.repository;

import com.example.sd18104.Entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MauSacRepository extends JpaRepository<MauSac, UUID> {
    @Query("select obj from MauSac obj where obj.ma = ?1")
    public MauSac findByMa(String ma);
}
