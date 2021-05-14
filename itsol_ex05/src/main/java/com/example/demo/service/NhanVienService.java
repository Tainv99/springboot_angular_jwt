package com.example.demo.service;

import com.example.demo.dao.NhanVienDAO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhanVienBO;
import com.example.demo.mapper.NhanVienMapper;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Autowired
    private NhanVienMapper nhanVienMapper;
    @Autowired
    private NhanVienDAO nhanVienDAO;

    public List<NhanVienDTO> getEmpNotSales() {
        return nhanVienDAO.getEmployeeNotSales();
    }

    public List<NhanVienDTO> getEmployees() {
        List<NhanVienBO> bos = nhanVienRepository.findAll();
        return nhanVienMapper.toDto(bos);
    }
    public void addEmployee(NhanVienDTO nhanVienDTO){
        NhanVienBO bo = nhanVienMapper.toEntity(nhanVienDTO);
        nhanVienRepository.save(bo);
    }
    public void updateEmployee(NhanVienDTO nhanVienDTO,Integer maNhanVien){
        Optional<NhanVienBO> nv1 = nhanVienRepository.findById(maNhanVien);
        NhanVienBO bo = nhanVienMapper.toEntity(nhanVienDTO);
        if(nv1.isPresent()){
            nv1.get().setPhuCap(bo.getPhuCap());
            nv1.get().setNgayLamViec(bo.getNgayLamViec());
            nv1.get().setNgaySinh(bo.getNgaySinh());
            nv1.get().setTen(bo.getTen());
            nv1.get().setHo(bo.getHo());
            nv1.get().setDiaChi(bo.getDiaChi());
            nv1.get().setLuongCoBan(bo.getLuongCoBan());
            nhanVienRepository.save(nv1.get());
        }
    }
    public NhanVienDTO findById(Integer maNhanVien){
        Optional<NhanVienBO> boOpt =nhanVienRepository.findById(maNhanVien);
        boOpt.isPresent();
        return nhanVienMapper.toDto(boOpt.get());
    }
    public void delete(Integer maNhanVien){
        nhanVienRepository.deleteById(maNhanVien);
    }
}
