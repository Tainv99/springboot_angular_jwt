package com.example.demo.entity;

import com.example.demo.dto.MatHangDTO;

import javax.persistence.*;

@Entity
@Table(name = "mathang")
@SqlResultSetMapping(
        name = "mappingProduct",
        classes = {
                @ConstructorResult(
                        targetClass = MatHangDTO.class,
                        columns = {
                                @ColumnResult(name = "TENHANG", type = String.class),
                                @ColumnResult(name = "SOLUONG", type = int.class),
                                @ColumnResult(name = "DONVITINH", type = String.class),
                                @ColumnResult(name = "GIAHANG", type = double.class),
                        }
                )
        }
)
public class MatHangBO {
    @Id
    @Column(name = "MAHANG")
    private Integer maHang;
    @Column(name = "TENHANG")
    private String tenHang;
    @Column(name = "MACONGTY")
    private int maCongty;
    @Column(name = "MALOAIHANG")
    private int maLoaiHang;
    @Column(name = "SOLUONG")
    private int soLuong;
    @Column(name = "DONVITINH")
    private String donViTinh;
    @Column(name = "GIAHANG")
    private double giaHang;

    public MatHangBO(){}

    public MatHangBO(Integer maHang, String tenHang, int maCongty, int maLoaiHang, int soLuong, String donViTinh, double giaHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.maCongty = maCongty;
        this.maLoaiHang = maLoaiHang;
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
