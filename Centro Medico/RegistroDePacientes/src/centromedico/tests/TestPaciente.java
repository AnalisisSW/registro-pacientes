/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.Paciente;

/**
 *
 * @author Grupo 7
 */
public class TestPaciente {
    
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setCodigo("1");
        paciente1.setApellido("Timberg");
        paciente1.setNombre("Avicii");
        System.out.println(paciente1.toString());
        
        Paciente paciente2 = new Paciente(paciente1.getCodigo(), paciente1.getApellido(), paciente1.getNombre());
        System.out.println(paciente2.toString());
        
    }
}
