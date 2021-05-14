package com.example.demo.service;

import com.example.demo.dao.MatHangDao;
import com.example.demo.dto.MatHangDTO;
import com.example.demo.entity.MatHangBO;
import com.example.demo.mapper.MatHangMapper;
import com.example.demo.repository.MatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatHangService {
    @Autowired
    private MatHangRepository matHangRepository;
    @Autowired
    private MatHangDao matHangDao;
    @Autowired
    private MatHangMapper matHangMapper;

    public List<MatHangDTO> getAll() {
        List<MatHangBO> bos = matHangRepository.findAll();
        return matHangMapper.toDto(bos);
    }
    public void addProduct(MatHangDTO matHangDTO){
        MatHangBO bo = matHangMapper.toEntity(matHangDTO);
        matHangRepository.save(bo);
    }
    public List<MatHangDTO> getProuctByIdCataLog(Integer maLoaiHang){
        return matHangDao.getProductDTO(maLoaiHang);
    }
}
