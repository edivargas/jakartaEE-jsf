/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.mb;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import mx.org.javaup.demojsf.dao.ArticuloDAO;
import mx.org.javaup.demojsf.model.Articulo;

/**
 *
 * @author edivargas
 */
@Named(value = "articuloMB")
@RequestScoped
public class ArticuloMB {
    
    @Inject
    ArticuloDAO articuloDAO;
    
    
    private List<Articulo> articulos = new ArrayList<>();

    /**
     * Creates a new instance of ArticuloMB
     */
    public ArticuloMB() {
    }
    
    public String consulta() {
        articulos.clear();
        articulos.addAll(articuloDAO.getAll());
        return "consulta";
    }
    
    public List<Articulo> getArticulos() {
        return articulos;
    }
    
}
