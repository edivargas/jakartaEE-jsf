/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.rs;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import mx.org.javaup.demojsf.dao.ArticuloDAO;
import mx.org.javaup.demojsf.model.Articulo;

/**
 *
 * @author edivargas
 */
@Path("articulo")
public class ArticuloRS {
    
    @Inject
    ArticuloDAO articuloDAO;

    @GET
    @Path("all")
    public List<Articulo> getAll() {
        return articuloDAO.getAll();
    }
    
    @GET
    @Path("{id}")
    public Articulo getById(@PathParam("id") Integer idArticulo) {
        return articuloDAO.getById(idArticulo);
    }
}
