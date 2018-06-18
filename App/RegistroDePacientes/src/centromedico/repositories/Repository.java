/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.repositories;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Grupo 7
 * Clase abstracta Repository que va a ser extendida por los repositorios particulares
 * o DAOs que son los Data Access Object que van a realizar las ABMC contra la bdd
 */
public abstract class Repository {
    
    //Atributto privado para la Conexion
    protected SessionFactory factory;
    
    //metodo save
    public String save(Object o){
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            String id = (String) s.save(o);
            tx.commit();
            return id;            
        } catch (HibernateException ex) {
            tx.rollback();
            throw ex;
        } finally {
            s.close();
        }
    }
    
    //metodo update
    public void update(Object o){
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.update(o);
            tx.commit();
        } catch (HibernateException ex) {
            tx.rollback();
            throw ex;
        } finally {
            s.close();
        }
    }
    
    //metodo delete
    public void delete(Object o){
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.delete(o);
            tx.commit();
        } catch (HibernateException ex) {
            tx.rollback();
            throw ex;
        } finally {
            s.close();
        }
    }
    
    //metodo GetById
    public Object getById(Class<?> nameClass, String id){
        Session s = factory.openSession();
        try {
            Object retorno = s.get(nameClass, id);
            return retorno;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return null;
        } finally {
            s.close();
        }
    }

    /**
     * Get Factory
     * @return factory
     */
    public SessionFactory getFactory() {
        return factory;
    }
    
}
