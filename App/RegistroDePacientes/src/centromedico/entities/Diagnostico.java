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
 * Clase utilizada como POJO para mapear contra la base de datos
 * Se definen las anotaciones Entity y Table para que hibernate reconozca
 * que es una clase con anotaciones para ser mapeada con una tabla de bdd
 */
@Entity
@Table(name="Diagnosticos")
public class Diagnostico implements Serializable {
    
    //Se utiliza un id que va a ser nuestra clave primaria en la tabla
    @Id    
    @GeneratedValue //se define que es auto_increment y tambien se define el nombre de la columna
    @Column(name="id_diagnostico")
    private Long id;
    
    //nombre de columna
    @Column(name="codPac")
    private String codPac;
    
    //nombre de columna
    @Column(name="codMed")
    private String codMed;
    
    //nombre de columna
    @Column(name="diagnostico")
    private String diagnostico;

    /**
     * Constructor vacio
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
