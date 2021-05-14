package com.example.demo.service;

import com.example.demo.dao.DonDatHangDao;
import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.entity.DonDatHangBO;
import com.example.demo.mapper.DonDatHangMapper;
import com.example.demo.repository.DonDatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonDatHangService {
    @Autowired
    private DonDatHangRepository donDatHangRepository;
    @Autowired
    private DonDatHangMapper donDatHangMapper;
    @Autowired
    private DonDatHangDao donDatHangDao;

    public List<DonDatHangDTO> getAllDTO() {
        return donDatHangDao.getAllDTO();
    }

    public List<DonDatHangDTO> getAll() {
        List<DonDatHangBO> bo = donDatHangRepository.findAll();
        return donDatHangMapper.toDto(bo);
    }
    public void addDon(DonDatHangDTO donDatHangDTO){
        DonDatHangBO bo = donDatHangMapper.toEntity(donDatHangDTO);
        donDatHangRepository.save(bo);
    }
}
