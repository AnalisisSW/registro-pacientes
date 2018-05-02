/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Medico;

/**
 *
 * @author Grupo 7
 */
public class TestMedico {
    
    public static void main(String[] args) {
        Medico m1 = new Medico();
        m1.setNombre("Dr. House");
        m1.setCodigo("1");
        m1.setEspecialidad("pancreatitis");
        System.out.println(m1.toString());
        
        Medico m2 = new Medico(m1.getCodigo(), m1.getNombre(), m1.getEspecialidad());
        System.out.println(m2.toString());
    }
}
