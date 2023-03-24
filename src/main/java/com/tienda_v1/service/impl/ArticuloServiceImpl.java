package com.tienda_v1.service.impl;

import com.tienda_v1.dao.ArticuloDao;
import com.tienda_v1.domain.Articulo;
import com.tienda_v1.services.ArticuloService;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ArticuloServiceImpl implements ArticuloService {
    
    //Esto crea una unica copia de un objeto
    @Autowired
    private ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos){
        var lista= (List<Articulo>) articuloDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    public void deleteArticulo(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloDao.save(articulo);
    }
    
}
