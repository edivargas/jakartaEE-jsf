/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.javaup.demojsf.bean;

import lombok.Data;

/**
 *
 * @author edivargas
 */
@Data
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String login;
    private String password;
    private String profiles;

}
