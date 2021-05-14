package com.example.demo.entity;

import com.example.demo.dto.DonDatHangDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dondathang")
@SqlResultSetMapping(
        name = "mapping",
        classes = {
                @ConstructorResult(
                        targetClass = DonDatHangDTO.class,
                        columns = {
                                @ColumnResult(name = "SOHOADON", type = Integer.class),
                                @ColumnResult(name = "NOIGIAOHANG", type = String.class),
                                @ColumnResult(name = "GIABAN", type = double.class),
                                @ColumnResult(name = "SOLUONG", type = int.class),
                                @ColumnResult(name = "TENHANG", type = String.class),
                                @ColumnResult(name = "NGAYGIAOHANG", type = Date.class),
                                @ColumnResult(name = "TENCONGTY", type = String.class),
                        }
                )
        }
)
public class DonDatHangBO {
    @Id
    @Column(name = "SOHOADON")
    private Integer soHoaDon;
    @Column(name = "MANHANVIEN")
    private int maNhanVien;
    @Column(name = "MAKHACHHANG")
    private int maKhachHang;
    @Column(name = "NGAYDATHANG")
    private Date ngayDatHang;
    @Column(name = "NGAYGIAOHANG")
    private Date ngayGiaoHang;
    @Column(name = "NGAYCHUYENHANG")
    private Date ngayChuyenHang;
    @Column(name = "NOIGIAOHANG")
    private String noiGiaoHang;

    public DonDatHangBO() {
    }

    public DonDatHangBO(Integer soHoaDon, int maNhanVien, int maKhachHang, Date ngayDatHang, Date ngayGiaoHang, Date ngayChuyenHang, String noiGiaoHang) {
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

    public int getMaKhachHang() {
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
}
