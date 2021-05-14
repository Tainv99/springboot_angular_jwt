package com.example.demo.dto;

import com.example.demo.utils.CustomDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.util.Date;

public class NhanVienDTO {
    private Integer maNhanVien;
    private String ho;
    private String ten;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date ngaySinh;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date ngayLamViec;
    private String diaChi;
    private BigDecimal luongCoBan;
    private BigDecimal phuCap;

    public NhanVienDTO(){}
    public NhanVienDTO(Integer maNhanVien, String ho, String ten, Date ngaySinh, Date ngayLamViec, String diaChi, BigDecimal luongCoBan, BigDecimal phuCap) {
        this.maNhanVien = maNhanVien;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayLamViec = ngayLamViec;
        this.diaChi = diaChi;
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
    }

    public NhanVienDTO(Integer maNhanVien, String ho, String ten, Date ngaySinh, Date ngayLamViec, String diaChi, BigDecimal luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayLamViec = ngayLamViec;
        this.diaChi = diaChi;
        this.luongCoBan = luongCoBan;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BigDecimal getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(BigDecimal luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public BigDecimal getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(BigDecimal phuCap) {
        this.phuCap = phuCap;
    }
}
