package com.example.demo.rest;

import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.dto.LoaiHangDTO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.service.DonDatHangService;
import com.example.demo.service.LoaiHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loaihang")
public class LoaiHangRest {
    @Autowired
    private LoaiHangService loaiHangService;

    @GetMapping()
    public ResponseEntity<List<LoaiHangDTO>> getAll() {
        List<LoaiHangDTO> dataResponse = loaiHangService.getLoaiHang();
        return ResponseEntity.ok(dataResponse);
    }

    @GetMapping("/{maloaiHang}")
    public ResponseEntity<List<LoaiHangDTO>> getLoaiHang(@PathVariable Integer maloaiHang) {
        List<LoaiHangDTO> dataResponse = loaiHangService.getLoaiHangDTO(maloaiHang);
        return ResponseEntity.ok(dataResponse);
    }
}
