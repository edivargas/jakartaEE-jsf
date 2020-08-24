/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.ejb;

import javax.ejb.Stateless;
import mx.org.javaup.demojsf.bean.User;

/**
 *
 * @author edivargas
 */
@Stateless
public class AdminEJB {

    public boolean isAllowed(User user) {
        System.out.println("Desde el EJB");
        return true;
    }

}
