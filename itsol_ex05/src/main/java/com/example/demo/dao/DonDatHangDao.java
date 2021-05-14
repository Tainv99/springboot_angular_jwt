package com.example.demo.dao;

import com.example.demo.dto.DonDatHangDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DonDatHangDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<DonDatHangDTO> getAllDTO() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT ");
        sql.append("    DH.SOHOADON, ");
        sql.append("    DH.NOIGIAOHANG, ");
        sql.append("    CT.GIABAN, ");
        sql.append("    CT.SOLUONG, ");
        sql.append("    MH.TENHANG, ");
        sql.append("    DH.NGAYGIAOHANG, ");
        sql.append("    KH.TENCONGTY ");
        sql.append(" FROM KHACHHANG KH ");
        sql.append(" INNER JOIN DONDATHANG DH on KH.MAKHACHHANG=DH.MAKHACHHANG");
        sql.append(" INNER JOIN CHITIETDATHANG CT on DH.SOHOADON=CT.SOHOADON ");
        sql.append(" INNER JOIN MATHANG MH ON CT.MAHANG=MH.MAHANG ");
        Query query = entityManager.createNativeQuery(sql.toString(), "mapping");
        return query.getResultList();
    }
}
