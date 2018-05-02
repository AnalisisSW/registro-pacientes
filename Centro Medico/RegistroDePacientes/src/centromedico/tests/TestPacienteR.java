/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Paciente;
import centromedico.hibernate.manager.SessionFactoryManager;
import centromedico.repositories.PacienteR;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupo 7
 */
public class TestPacienteR {
    
    public static void main(String[] args) {
        
        SessionFactory factory = SessionFactoryManager.getSessionFactory();
        
        PacienteR pacienteRepo = new PacienteR(factory);
        Paciente nuevo = new Paciente("1", "Perez", "Facundo");
        
        //Save
//        try {
//            pacienteRepo.save(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //Update
//        try {
//            nuevo.setNombre("Lautaro");
//            pacienteRepo.update(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }

        //Delete
//        try {
//            pacienteRepo.delete(nuevo);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetById
//        try {
//            Paciente retorno = (Paciente) pacienteRepo.getById(Paciente.class, "1");
//            System.out.println(retorno);
//        } catch (HibernateException ex) {
//            System.out.println(ex);
//        }
        
        //GetAll
        List<Paciente> pacientes = new ArrayList<>();
        try {
            pacientes = pacienteRepo.getAll();
            pacientes.forEach(System.out::println);
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        
        factory.close();
        System.exit(0);
    }
}
