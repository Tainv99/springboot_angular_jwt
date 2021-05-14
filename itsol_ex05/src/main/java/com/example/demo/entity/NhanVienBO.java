package com.example.demo.entity;

import com.example.demo.dto.NhanVienDTO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "nhanvien")
@SqlResultSetMapping(
        name = "emp_not_sales_mapping",
        classes = {
                @ConstructorResult(
                        targetClass = NhanVienDTO.class,
                        columns = {
                                @ColumnResult(name = "MANHANVIEN", type = Integer.class),
                                @ColumnResult(name = "HO", type = String.class),
                                @ColumnResult(name = "TEN", type = String.class),
                                @ColumnResult(name = "NGAYSINH", type = Date.class),
                                @ColumnResult(name = "NGAYLAMVIEC", type = Date.class),
                                @ColumnResult(name = "DIACHI", type = String.class),
                                @ColumnResult(name = "LUONGCODINH", type = BigDecimal.class),
                        }
                )
        }
)
public class NhanVienBO {
    @Id
    @Column(name = "MANHANVIEN")
    private Integer maNhanVien;
    @Column(name = "HO")
    private String ho;
    @Column(name = "TEN")
    private String ten;
    @Column(name = "NGAYSINH")
    private Date ngaySinh;
    @Column(name = "NGAYLAMVIEC")
    private Date ngayLamViec;
    @Column(name = "DIACHI")
    private String diaChi;
    @Column(name = "LUONGCODINH")
    private BigDecimal luongCoBan;
    @Column(name = "PHUCAP")
    private BigDecimal phuCap;

    public NhanVienBO() {
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
