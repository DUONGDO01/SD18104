package com.example.sd18104.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DongSP extends JpaRepository<DongSP, UUID> {
}
