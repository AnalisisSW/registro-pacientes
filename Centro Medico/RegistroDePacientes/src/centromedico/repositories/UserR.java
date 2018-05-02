/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.repositories;

import org.hibernate.SessionFactory;

/**
 *
 * @author Grupo 7
 */
public class UserR extends Repository {

    public UserR(SessionFactory factory) {
        if(factory == null){
            throw new NullPointerException("sessionFactory is mandatory");
        }
        this.factory = factory;
    }
    
}
