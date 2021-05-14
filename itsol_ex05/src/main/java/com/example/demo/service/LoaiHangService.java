package com.example.demo.service;

import com.example.demo.dao.LoaiHangDao;
import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.dto.LoaiHangDTO;
import com.example.demo.entity.LoaiHangBO;
import com.example.demo.mapper.LoaiHangMapper;
import com.example.demo.repository.LoaiHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiHangService {
    @Autowired
    LoaiHangRepository loaiHangRepository;
    @Autowired
    LoaiHangDao loaiHangDao;
    @Autowired
    LoaiHangMapper loaiHangMapper;

    public List<LoaiHangDTO> getLoaiHang(){
        List<LoaiHangBO> bo = loaiHangRepository.findAll();
        return loaiHangMapper.toDto(bo);
    }

    public void addLoaiHang(LoaiHangDTO loaiHangDTO){
        LoaiHangBO bo = loaiHangMapper.toEntity(loaiHangDTO);
        loaiHangRepository.save(bo);
    }

    public List<LoaiHangDTO> getLoaiHangDTO(Integer maloaihang) {
        return loaiHangDao.getLoaiHangDTO(maloaihang);
    }
}
