package com.example.demo.dao;

import com.example.demo.dto.LoaiHangDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class LoaiHangDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<LoaiHangDTO> getLoaiHangDTO(Integer maloaihang) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT ");
        sql.append(" MALOAIHANG, ");
        sql.append(" TENLOAIHANG ");
        sql.append(" FROM ");
        sql.append(" LOAIHANG WHERE MALOAIHANG =  " +maloaihang);
        Query query = entityManager.createNativeQuery(sql.toString(), "mappingloaihang");
        return query.getResultList();
    }
}
