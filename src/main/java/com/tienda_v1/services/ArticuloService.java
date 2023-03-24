/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_v1.services;

import com.tienda_v1.domain.Articulo;
import java.util.List;

/**
 *
 * @author Santiago
 */
public interface ArticuloService {
    
    //Obtiene la lista de registros de la tabla articulo
    //y lo coloca en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);
    
    //Obtiene el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto cleinte
    public Articulo getArticulo(Articulo articulo);
    
    //Elimina el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto articulo
    public void deleteArticulo(Articulo articulo);
    
    //Si el idArticulo pasado no existe o es nulo se crea
    //un registro nuevo en la tabla articulo
    //si el idArticulo existe... se actualiza la informacion
    public void saveArticulo(Articulo articulo);
    
}
