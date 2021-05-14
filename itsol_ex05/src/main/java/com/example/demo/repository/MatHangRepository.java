package com.example.demo.repository;

import com.example.demo.entity.MatHangBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatHangRepository extends JpaRepository<MatHangBO,Integer> {
}
