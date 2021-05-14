package com.example.demo.service;

import com.example.demo.dto.NhaCungCapDTO;
import com.example.demo.entity.NhaCungCapBO;
import com.example.demo.mapper.NhaCungCapMapper;
import com.example.demo.repository.NhaCungCapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhaCungCapService {
    @Autowired
    NhaCungCapRepository nhaCungCapRepository;
    @Autowired
    NhaCungCapMapper nhaCungCapMapper;

    public List<NhaCungCapDTO> getAll(){
        List<NhaCungCapBO> bos = nhaCungCapRepository.findAll();
        return nhaCungCapMapper.toDto(bos);
    }

    public void addNhaCungCap(NhaCungCapDTO nhaCungCapDTO){
        NhaCungCapBO bo = nhaCungCapMapper.toEntity(nhaCungCapDTO);
        nhaCungCapRepository.save(bo);
    }

    public void deletenhaCungCap(Integer maCongty){
       nhaCungCapRepository.deleteById(maCongty);
    }
    public NhaCungCapDTO getByID(Integer maCongty){
        Optional<NhaCungCapBO> bos =nhaCungCapRepository.findById(maCongty);
        bos.isPresent();
        return nhaCungCapMapper.toDto(bos.get());
    }
}
