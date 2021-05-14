package com.example.demo.dto;


public class MatHangDTO {
    private Integer maHang;
    private String tenHang;
    private int maCongty;
    private int maLoaiHang;
    private int soLuong;
    private String donViTinh;
    private double giaHang;

    public MatHangDTO(){}

    public MatHangDTO(Integer maHang, String tenHang, int maCongty, int maLoaiHang, int soLuong, String donViTinh, double giaHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.maCongty = maCongty;
        this.maLoaiHang = maLoaiHang;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaHang = giaHang;
    }

    public MatHangDTO(String tenHang, int soLuong, String donViTinh, double giaHang) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaHang = giaHang;
    }

    public Integer getMaHang() {
        return maHang;
    }

    public void setMaHang(Integer maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaCongty() {
        return maCongty;
    }

    public void setMaCongty(int maCongty) {
        this.maCongty = maCongty;
    }

    public int getMaLoaiHang() {
        return maLoaiHang;
    }

    public void setMaLoaiHang(int maLoaiHang) {
        this.maLoaiHang = maLoaiHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(double giaHang) {
        this.giaHang = giaHang;
    }
}
