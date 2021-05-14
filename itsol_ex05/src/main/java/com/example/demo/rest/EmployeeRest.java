package com.example.demo.rest;

import com.example.demo.dto.NhanVienDTO;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeRest {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping()
    public ResponseEntity<List<NhanVienDTO>> getEmployees() {
        List<NhanVienDTO> dataResponse = nhanVienService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
    @PostMapping
    public String addEmployee(@RequestBody NhanVienDTO nhanVienDTO){
        nhanVienService.addEmployee(nhanVienDTO);
        return "OK";
    }
    @GetMapping("/employees-not-sales")
    public ResponseEntity<List<NhanVienDTO>> getEmpNotSales() {
        List<NhanVienDTO> dataResponse = nhanVienService.getEmpNotSales();
        return ResponseEntity.ok(dataResponse);
    }
    @GetMapping("/{maNhanVien}")
    public ResponseEntity<NhanVienDTO> findById(@PathVariable Integer maNhanVien) {
        NhanVienDTO boOpt = nhanVienService.findById(maNhanVien);
        return ResponseEntity.ok(boOpt);
    }
    @PutMapping("/{maNhanVien}")
    public String update(@RequestBody NhanVienDTO nhanVienDTO, @PathVariable Integer maNhanVien){
        nhanVienService.updateEmployee(nhanVienDTO,maNhanVien);
        return "sửa thành công";
    }
    @DeleteMapping("/{maNhaVien}")
    public String deleteEmployee(@PathVariable Integer maNhaVien){
        nhanVienService.delete(maNhaVien);
        return "xóa thành công";
    }

}
