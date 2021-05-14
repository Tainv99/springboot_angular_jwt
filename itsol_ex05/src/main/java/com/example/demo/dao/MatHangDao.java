package com.example.demo.dao;

import com.example.demo.dto.MatHangDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class MatHangDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<MatHangDTO> getProductDTO(Integer maloaihang) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT ");
        sql.append(" TENHANG, ");
        sql.append(" SOLUONG, ");
        sql.append(" DONVITINH, ");
        sql.append(" GIAHANG ");
        sql.append(" FROM ");
        sql.append(" MATHANG WHERE MALOAIHANG =  " +maloaihang);
        Query query = entityManager.createNativeQuery(sql.toString(), "mappingProduct");
        return query.getResultList();
    }
}
