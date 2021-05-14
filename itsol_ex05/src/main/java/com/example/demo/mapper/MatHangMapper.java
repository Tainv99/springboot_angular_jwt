package com.example.demo.mapper;

import com.example.demo.dto.MatHangDTO;
import com.example.demo.entity.MatHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MatHangMapper extends EntityMapper<MatHangDTO, MatHangBO>{
}
