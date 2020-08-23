/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.mb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import lombok.Data;
import mx.org.javaup.demojsf.bean.User;

/**
 *
 * @author edivargas
 */
@Named(value = "loginMB") 
@SessionScoped
@Data
public class LoginMB implements Serializable {
    
    private User user; 

    /**
     * Creates a new instance of Login
     */
    public LoginMB() {
    }
    
}
