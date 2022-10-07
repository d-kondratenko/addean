package com.epic.addean.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;


@Repository
@Slf4j
public class DatabaseRepository {
    @Autowired
    EntityManager entityManager;

    public String callProcedure(String productNr, Integer levelNr, String eanNr){
        try {

            StoredProcedureQuery procedure = entityManager.createStoredProcedureQuery("lcp_add_ean_to_product");
            procedure.registerStoredProcedureParameter("p_product_nr", String.class, ParameterMode.IN);
            procedure.registerStoredProcedureParameter("p_level_nr", Integer.class, ParameterMode.IN);
            procedure.registerStoredProcedureParameter("p_ean_nr", String.class, ParameterMode.IN);
            procedure.setParameter("p_product_nr", productNr);
            procedure.setParameter("p_level_nr", levelNr);
            procedure.setParameter("p_ean_nr", eanNr);
            procedure.execute();

            return "OK";
        } catch (Exception e) {
            if(e.getCause() != null){
                return e.getCause().getCause().getLocalizedMessage();
            } else {
                return e.getLocalizedMessage();
            }

        }
    }
}
