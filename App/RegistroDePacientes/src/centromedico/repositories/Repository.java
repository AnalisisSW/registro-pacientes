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
 */
public abstract class Repository {
    
    protected SessionFactory factory;
    
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

    public SessionFactory getFactory() {
        return factory;
    }
    
}
