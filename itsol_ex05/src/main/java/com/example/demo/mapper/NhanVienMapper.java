package com.example.demo.mapper;

import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhanVienBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhanVienMapper extends EntityMapper<NhanVienDTO, NhanVienBO>{
}
