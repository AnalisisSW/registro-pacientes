/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Grupo 7
 */
@Entity
@Table(name="Diagnosticos")
public class Diagnostico implements Serializable {
    
    @Id    
    @GeneratedValue
    @Column(name="id_diagnostico")
    private Long id;
    
    @Column(name="codPac")
    private String codPac;
    
    @Column(name="codMed")
    private String codMed;
    
    @Column(name="diagnostico")
    private String diagnostico;

    /**
     * Constructor x defecto
     */
    public Diagnostico() {
    }

    /**
     * Constructor parametrizado
     * @param codPac
     * @param codMed
     * @param diagnostico
     */
    public Diagnostico(String codPac, String codMed, String diagnostico) {
        this.codPac = codPac;
        this.codMed = codMed;
        this.diagnostico = diagnostico;
    }

    /**
     * Get Id
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Set Id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Get codigo del paciente
     * @return codPac
     */
    public String getCodPac() {
        return codPac;
    }

    /**
     * Set codigo del paciente
     * @param codPac
     */
    public void setCodPac(String codPac) {
        this.codPac = codPac;
    }

    /**
     * Get codigo del medico
     * @return codMed
     */
    public String getCodMed() {
        return codMed;
    }

    /**
     * Set codigo del medico
     * @param codMed
     */
    public void setCodMed(String codMed) {
        this.codMed = codMed;
    }

    /**
     * Get diagnostico
     * @return diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Set diagnostico
     * @param diagnostico
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * Metodo toString de diagnostico
     * @return 
     */
    @Override
    public String toString() {
        return "Diagnostico: " + "\nCodigo del Paciente: " + codPac +
                "\nCodigo del Medico: " + codMed + "\nDiagnostico: " + diagnostico + "\n";
    }

}
