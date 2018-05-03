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
@Table(name="Medicos")
public class Medico implements Serializable, Comparable<Medico> {
    @Id
    @Column(name="codigo")
    private String codigo;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="especialidad")
    private String especialidad;

    /**
     * Constructor x defecto
     */
    public Medico() {
    }

    /**
     * Constructor parametrizado
     * @param codigo
     * @param nombre
     * @param especialidad
     */
    public Medico(String codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    /**
     * Get codigo del medico
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set codigo del medico
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Get nombre del medico
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set nombre del medico
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get especialidad
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Set especialidad
     * @param especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    /**
     * Metodo toString de medico
     * @return String
     */
    @Override
    public String toString() {
        return "Medico: " + "\nCodigo: " + codigo + "\nNombre: " +
                nombre + "\nEspecialidad: " + especialidad + "\n";
    }

    @Override
    public int compareTo(Medico o) {
        return this.especialidad.compareTo(o.especialidad);
    }
    
}
