package com.example.demo.rest;

import com.example.demo.dto.NhaCungCapDTO;
import com.example.demo.service.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/cungcap")
public class NhaCungCapRest {
    @Autowired
    NhaCungCapService nhaCungCapService;
    @GetMapping
    public ResponseEntity<List<NhaCungCapDTO>> getAll(){
        List<NhaCungCapDTO> dto =nhaCungCapService.getAll();
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public String add(@RequestBody NhaCungCapDTO nhaCungCapDTO){
        nhaCungCapService.addNhaCungCap(nhaCungCapDTO);
        return "OK";
    }
    @GetMapping("/{maCongty}")
    public ResponseEntity<NhaCungCapDTO> findById(@PathVariable Integer maCongty) {
        NhaCungCapDTO boOpt = nhaCungCapService.getByID(maCongty);
        return ResponseEntity.ok(boOpt);
    }
    @DeleteMapping("/{maCongty}")
    public void delete(@PathVariable Integer maCongty){
        nhaCungCapService.deletenhaCungCap(maCongty);
    }
}
