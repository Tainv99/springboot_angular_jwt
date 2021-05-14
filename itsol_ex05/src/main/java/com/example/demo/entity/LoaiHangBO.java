package com.example.demo.entity;

import com.example.demo.dto.LoaiHangDTO;

import javax.persistence.*;

@Entity
@Table(name = "LOAIHANG")
@SqlResultSetMapping(
        name = "mappingloaihang",
        classes = {
                @ConstructorResult(
                        targetClass = LoaiHangDTO.class,
                        columns = {
                                @ColumnResult(name = "MALOAIHANG", type = Integer.class),
                                @ColumnResult(name = "TENLOAIHANG", type = String.class),
                        }
                )
        }
)
public class LoaiHangBO {
    @Id
    @Column(name = "MALOAIHANG")
    private Integer maLoai;
    @Column(name = "TENLOAIHANG")
    private String tenLoaiHang;

    public LoaiHangBO(){}

    public LoaiHangBO(Integer maLoai, String tenLoaiHang) {
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
