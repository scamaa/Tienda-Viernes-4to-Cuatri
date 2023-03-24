package com.tienda_v1.dao;

import com.tienda_v1.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloDao extends JpaRepository<Articulo,Long> {
    
}
