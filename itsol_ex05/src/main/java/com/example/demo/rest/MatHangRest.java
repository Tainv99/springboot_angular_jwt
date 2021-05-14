package com.example.demo.rest;

import com.example.demo.dto.MatHangDTO;
import com.example.demo.service.MatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class MatHangRest {
    @Autowired
    private MatHangService matHangService;

    @GetMapping()
    public ResponseEntity<List<MatHangDTO>> getAll() {
        List<MatHangDTO> dataResponse = matHangService.getAll();
        return ResponseEntity.ok(dataResponse);
    }
    @GetMapping("/{maloaiHang}")
    public ResponseEntity<List<MatHangDTO>> getProductByIdCatalog(@PathVariable Integer maloaiHang) {
        List<MatHangDTO> dataResponse = matHangService.getProuctByIdCataLog(maloaiHang);
        return ResponseEntity.ok(dataResponse);
    }
    @PostMapping
    public String addProduct(@RequestBody MatHangDTO matHangDTO){
        matHangService.addProduct(matHangDTO);
        return "OK";
    }
}
