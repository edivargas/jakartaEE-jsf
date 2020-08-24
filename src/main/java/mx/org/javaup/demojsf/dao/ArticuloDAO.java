/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.org.javaup.demojsf.model.Articulo;

/**
 *
 * @author edivargas
 */
@Named(value = "articuloDAO")
@RequestScoped
public class ArticuloDAO {

    @PersistenceContext(unitName = "DemoJSF_PU")
    EntityManager em;

    public List<Articulo> getAll() {
        return em.createQuery("Select a FROM Articulo a", 
                Articulo.class).getResultList();
    }

}
