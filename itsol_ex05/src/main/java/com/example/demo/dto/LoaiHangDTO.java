package com.example.demo.dto;


public class LoaiHangDTO {
    private Integer maLoai;
    private String tenLoaiHang;

    public LoaiHangDTO(){}

    public LoaiHangDTO(Integer maLoai, String tenLoaiHang) {
        this.maLoai = maLoai;
        this.tenLoaiHang = tenLoaiHang;
    }

    public Integer getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }
}
