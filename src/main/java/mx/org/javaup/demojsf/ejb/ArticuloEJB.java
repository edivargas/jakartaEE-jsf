/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mx.org.javaup.demojsf.dao.ArticuloDAO;
import mx.org.javaup.demojsf.model.Articulo;

/**
 *
 * @author edivargas
 */
@Stateless
@WebService
public class ArticuloEJB {

    @Inject
    ArticuloDAO articuloDAO;

    public void addArticulo(Articulo articulo) {

    }

    public List<Articulo> getAllArticulos() {
        return articuloDAO.getAll();
    }

}
