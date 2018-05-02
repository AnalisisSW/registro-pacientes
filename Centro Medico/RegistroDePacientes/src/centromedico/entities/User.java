/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Grupo 7
 */
@Entity
@Table(name="Users")
public class User implements Serializable {
    
    @Id
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="password")
    private String password;
    
    @Column(name="dni")
    private String dni;

    /**
     * Constructor x defecto
     */
    public User() {
    }

    /**
     * Constructor parametrizado
     * @param usuario
     * @param password
     */
    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    /**
     * Constructor parametrizado
     * @param usuario
     * @param password
     * @param dni 
     */
    public User(String usuario, String password, String dni) {
        this.usuario = usuario;
        this.password = password;
        this.dni = dni;
    }
    
    /**
     * Get usuario
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set usuario
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Get password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get dni
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Set dni
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     * Metodo toString de Usuario
     * @return String
     */
    @Override
    public String toString() {
        return "Usuario: " + usuario + ", password: " + password + ", dni: " + dni;
    }
    
}
