package com.example.demo.rest;

import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.service.DonDatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/dondathang")
public class DonDatHangRest {
    @Autowired
    private DonDatHangService donDatHangService;

    @GetMapping()
    public ResponseEntity<List<DonDatHangDTO>> getAll() {
        List<DonDatHangDTO> dataResponse = donDatHangService.getAll();
        return ResponseEntity.ok(dataResponse);
    }
    @GetMapping("/getAllCt")
    public ResponseEntity<List<DonDatHangDTO>> getAllDTO() {
        List<DonDatHangDTO> dataResponse = donDatHangService.getAllDTO();
        return ResponseEntity.ok(dataResponse);
    }
    @PostMapping
    public String addDon(@RequestBody DonDatHangDTO donDatHangDTO){
        donDatHangService.addDon(donDatHangDTO);
        return "OK";
    }
}
