/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.repositories;

import centromedico.entities.Paciente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupo 7
 */
public class PacienteR extends Repository {

    public PacienteR(SessionFactory factory) {
        if(factory == null) {
            throw new NullPointerException("sessionFactory is mandatory");
        }
        this.factory = factory;
    }
    
    public List<Paciente> getAll(){
        Session s = factory.openSession();
        List<Paciente> pacientes = null;
        try {
            Query q = s.createQuery("from Paciente p");
            pacientes = q.list();
            return pacientes;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return pacientes;
        } finally {
            s.close();
        }
    }
    
}
