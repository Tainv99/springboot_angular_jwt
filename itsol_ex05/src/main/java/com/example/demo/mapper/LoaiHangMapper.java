package com.example.demo.mapper;

import com.example.demo.dto.LoaiHangDTO;
import com.example.demo.entity.LoaiHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoaiHangMapper extends EntityMapper<LoaiHangDTO, LoaiHangBO>{
}
