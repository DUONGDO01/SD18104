package com.example.sd18104.repository;

import com.example.sd18104.Entity.DongSp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DongSpRepository extends JpaRepository<DongSp, UUID> {
}
