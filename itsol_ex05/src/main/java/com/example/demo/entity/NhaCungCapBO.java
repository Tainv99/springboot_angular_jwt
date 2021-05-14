package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NHACUNGCAP")
public class NhaCungCapBO {
    @Id
    @Column(name = "MACONGTY")
    private Integer maCongTy;
    @Column(name = "TENCONGTY")
    private String tenCongTy;
    @Column(name = "TENGIAODICH")
    private String tenGiaoDich;
    @Column(name = "DIACHI")
    private String diaChi;
    @Column(name = "SODIENTHOAI")
    private int sdt;
    @Column(name = "FAX")
    private int fax;
    @Column(name = "EMAIL")
    private String email;

    public NhaCungCapBO(){}

    public NhaCungCapBO(Integer maCongTy, String tenCongTy, String tenGiaoDich, String diaChi, int sdt, int fax, String email) {
        this.maCongTy = maCongTy;
        this.tenCongTy = tenCongTy;
        this.tenGiaoDich = tenGiaoDich;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.fax = fax;
        this.email = email;
    }

    public Integer getMaCongTy() {
        return maCongTy;
    }

    public void setMaCongTy(Integer maCongTy) {
        this.maCongTy = maCongTy;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTenGiaoDich() {
        return tenGiaoDich;
    }

    public void setTenGiaoDich(String tenGiaoDich) {
        this.tenGiaoDich = tenGiaoDich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
