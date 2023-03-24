package com.tienda_v1.dao;

import com.tienda_v1.domain.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoDao extends JpaRepository<Credito,Long> {
    
}
