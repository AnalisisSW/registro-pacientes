/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Diagnostico;
import centromedico.hibernate.manager.SessionFactoryManager;
import centromedico.repositories.DiagnosticoR;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupo 7
 */
public class TestDiagnosticoR {
    
    public static void main(String[] args) {
        
        SessionFactory factory = SessionFactoryManager.getSessionFactory();
        
        DiagnosticoR diagnosticoRepo = new DiagnosticoR(factory);
        Diagnostico nuevo = new Diagnostico("1", "1", "Luxacion de codo");
        
        //Save
        try {
            diagnosticoRepo.save(nuevo);
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        
        //Update
//        try {
//            nuevo.setDiagnostico("Pancreatitis");
//            diagnosticoRepo.update(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //Delete
//        try {
//            diagnosticoRepo.delete(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetById
        try {
            Diagnostico retorno = (Diagnostico) diagnosticoRepo.getById(Diagnostico.class, "1");
            System.out.println(retorno);
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        factory.close();
        System.exit(0);
    }
}
