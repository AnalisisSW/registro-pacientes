/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Diagnostico;

/**
 *
 * @author Grupo 7
 */
public class TestDiagnostico {
    
    public static void main(String[] args) {
       Diagnostico info = new Diagnostico();
       info.setCodPac("1");
       info.setCodMed("1");
       info.setDiagnostico("Migrañas");
       System.out.println(info.toString());
       
       Diagnostico info2 = new Diagnostico(info.getCodPac(), info.getCodMed(), info.getDiagnostico());
       System.out.println(info2.toString());
       
    }
    
}
