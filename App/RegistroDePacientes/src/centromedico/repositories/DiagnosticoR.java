/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.repositories;

import centromedico.entities.Diagnostico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Facundo
 */
public class DiagnosticoR extends Repository{
    
    public DiagnosticoR(SessionFactory factory) {
        if(factory == null) {
            throw new NullPointerException("sessionFactory is mandatory");
        }
        this.factory = factory;
    }

    /**
     *
     * @param o
     * @return
     */
    
    public Long save(Diagnostico o) {
        Session s = factory.openSession();
        Transaction tx = null;
        try {
            tx=s.beginTransaction();
            Long id = (Long) s.save(o);
            tx.commit();
            return id;            
        } catch (HibernateException ex) {
            tx.rollback();
            throw ex;
        } finally {
            s.close();
        }
    }

    @Override
    public Diagnostico getById(Class<?> nameClass, String id) {
        Session s = factory.openSession();
        try {
            Diagnostico retorno = (Diagnostico) s.get(nameClass, Long.parseLong(id));
            return retorno;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return null;
        } finally {
            s.close();
        }
    }
    
    public List<Diagnostico> getByMedico(String codMed){
        List<Diagnostico> listaDiag = new ArrayList<>();
        Session s = factory.openSession();
        try {
            Query q = s.createQuery("from Diagnostico d where d.codMed = :cod");
            q.setParameter("cod", codMed);
            listaDiag = q.list();
            return listaDiag;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return listaDiag;
        } finally {
            s.close();
        }
    }
    
    public List<Diagnostico> getByCPCM(Class<?> nameClass, String codPac, String codMed) {
        Session s = factory.openSession();
        List<Diagnostico> listaDiag = new ArrayList<>();
        try {
            Query q = s.createQuery("from Diagnostico d where d.codPac = :codP and d.codMed = :codM");
            q.setParameter("codP", codPac);
            q.setParameter("codM", codMed);
            listaDiag = q.list();
            return listaDiag;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return listaDiag;
        } finally {
            s.close();
        }
    }
    
    public List<Diagnostico> getByCP(Class<?> nameClass, String codPac) {
        Session s = factory.openSession();
        List<Diagnostico> listaDiag = new ArrayList<>();
        try {
            Query q = s.createQuery("from Diagnostico d where d.codPac = :codP");
            q.setParameter("codP", codPac);
            listaDiag = q.list();
            return listaDiag;
        } catch (HibernateException ex) {
            System.out.println(ex);
            return listaDiag;
        } finally {
            s.close();
        }
    }
    
}
