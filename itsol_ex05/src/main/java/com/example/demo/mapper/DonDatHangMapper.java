package com.example.demo.mapper;

import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.entity.DonDatHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DonDatHangMapper extends EntityMapper<DonDatHangDTO, DonDatHangBO>{
}
