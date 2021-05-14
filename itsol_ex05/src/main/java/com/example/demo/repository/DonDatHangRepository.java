package com.example.demo.repository;

import com.example.demo.entity.DonDatHangBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonDatHangRepository extends JpaRepository<DonDatHangBO,Integer> {
}
