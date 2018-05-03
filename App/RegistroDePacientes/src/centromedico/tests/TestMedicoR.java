/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Medico;
import centromedico.hibernate.manager.SessionFactoryManager;
import centromedico.repositories.MedicoR;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupo 7
 */
public class TestMedicoR {
    
    public static void main(String[] args) {
        
        SessionFactory factory = SessionFactoryManager.getSessionFactory();
        
        MedicoR medicoRepo = new MedicoR(factory);
        Medico nuevo = new Medico("1","Dr.House","Traumatologo");
        
        //Save
//        try {
//            medicoRepo.save(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //Update
//        try {
//            nuevo.setEspecialidad("Neurologo");
//            medicoRepo.update(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //Delete
//        try {
//            medicoRepo.delete(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetById
//        try {
//            Medico retorno = (Medico) medicoRepo.getById(Medico.class, "1");
//            System.out.println(retorno);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetAll
        List<Medico> medicos = new ArrayList<>();
        try {
            medicos = medicoRepo.getAll();
            medicos.forEach(System.out::println);
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        
        factory.close();
        System.exit(0);
        
    }
    
}
