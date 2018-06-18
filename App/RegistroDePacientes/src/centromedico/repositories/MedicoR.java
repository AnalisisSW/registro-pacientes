/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.repositories;

import centromedico.entities.Medico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Grupo 7
 */
public class MedicoR extends Repository{
    
     public MedicoR(SessionFactory factory) {
        if(factory == null) {
            throw new NullPointerException("sessionFactory is mandatory");
        }
        this.factory = factory;
    }
    
    /**
     * Metodo getAll de medicos
     * @return medicos
     */
    public List<Medico> getAll(){
       Session s = factory.openSession();
       List<Medico> medicos = new ArrayList<>();
       try {
           Query q = s.createQuery("from Medico m");
           medicos = q.list();
           return medicos;
        } catch (HibernateException ex) {
           System.out.println(ex);
           return medicos;
        } finally {
           s.close();
        }
    }
    
    /**
     * Get by especialidad
     * @param especialidad
     * @return medicos
     */
    public List<Medico> getByEsp(String especialidad){
        Session s = factory.openSession();
        List<Medico> medicos = new ArrayList<>();
        try {
            Query q = s.createQuery("from Medico m where m.especialidad= :esp");
            q.setParameter("esp", especialidad);
            medicos = q.list();
            return medicos;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return medicos;
        } finally {
            s.close();
        }
    }
     
}
