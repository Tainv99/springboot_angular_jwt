package com.example.demo.dto;


public class NhaCungCapDTO {
    private Integer maCongTy;
    private String tenCongTy;
    private String tenGiaoDich;
    private String diaChi;
    private int sdt;
    private int fax;
    private String email;

    public NhaCungCapDTO(){}

    public NhaCungCapDTO(Integer maCongTy, String tenCongTy, String tenGiaoDich, String diaChi, int sdt, int fax, String email) {
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
