package com.example.demo.dto;


import java.util.Date;

public class DonDatHangDTO {
    private Integer soHoaDon;
    private int maNhanVien;
    private int maKhachHang;
    private Date ngayDatHang;
    private Date ngayGiaoHang;
    private Date ngayChuyenHang;
    private String noiGiaoHang;
    private double giaBan;
    private int soLuong;
    private String tenHang;
    private String tenCongty;

    public DonDatHangDTO(){}

    public DonDatHangDTO(Integer soHoaDon, String noiGiaoHang, double giaBan, int soLuong,String tenHang,Date ngayGiaoHang,String tenCongty) {
        this.soHoaDon = soHoaDon;
        this.noiGiaoHang = noiGiaoHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.tenHang = tenHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.tenCongty = tenCongty;
    }

    public DonDatHangDTO(Integer soHoaDon, int maNhanVien, int maKhachHang, Date ngayDatHang, Date ngayGiaoHang, Date ngayChuyenHang, String noiGiaoHang) {
        this.soHoaDon = soHoaDon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.ngayDatHang = ngayDatHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.ngayChuyenHang = ngayChuyenHang;
        this.noiGiaoHang = noiGiaoHang;
    }

    public Integer getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(Integer soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Date getNgayChuyenHang() {
        return ngayChuyenHang;
    }

    public void setNgayChuyenHang(Date ngayChuyenHang) {
        this.ngayChuyenHang = ngayChuyenHang;
    }

    public String getNoiGiaoHang() {
        return noiGiaoHang;
    }

    public void setNoiGiaoHang(String noiGiaoHang) {
        this.noiGiaoHang = noiGiaoHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenCongty() {
        return tenCongty;
    }

    public void setTenCongty(String tenCongty) {
        this.tenCongty = tenCongty;
    }
}
