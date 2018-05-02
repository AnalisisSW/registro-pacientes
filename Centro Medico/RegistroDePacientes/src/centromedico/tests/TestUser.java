/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.tests;

import centromedico.entities.User;

/**
 *
 * @author Grupo 7
 */
public class TestUser {
    
    public static void main(String[] args) {
        User nuevo = new User();
        nuevo.setUsuario("Facu96");
        nuevo.setPassword("1234");
        nuevo.setDni("39436162");
        System.out.println(nuevo.toString());
        
        User copia = new User(nuevo.getUsuario(), nuevo.getPassword(), nuevo.getDni());
        System.out.println(copia.toString());
    }
}
