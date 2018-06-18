/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.User;
import centromedico.hibernate.manager.SessionFactoryManager;
import centromedico.repositories.UserR;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 * @author Grupo 7
 * Test UserR
 */
public class TestUserR {
    
    public static void main(String[] args) {
        
        SessionFactory factory = SessionFactoryManager.getSessionFactory();
        
        UserR userRepo = new UserR(factory);
        User nuevo = new User("Facu", "1234", "39436162");
        
        //Save
        try {
            userRepo.save(nuevo);            
        } catch (HibernateException ex) {
            System.out.println(ex);
        } 
        
        //Update
//        try {
//            nuevo.setPassword("bocajuniors");
//            userRepo.update(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }

        //Delete
//        try {
//            userRepo.delete(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetById
        try {
            User retorno = (User) userRepo.getById(User.class, "Facu");
            System.out.println(retorno);
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        factory.close();
        System.exit(0);
    }
}
