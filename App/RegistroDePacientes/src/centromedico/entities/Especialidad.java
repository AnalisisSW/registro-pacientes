package centromedico.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Facundo
 */
public abstract class Especialidad {
    
    private static final List<String> ESPECIALIDADES_LIST = new ArrayList<>(Arrays.asList(
            "Cardiología","Cirugia","Dermatología","Diabetes","Endocrinología",
            "Gastroenterología","Ginecología y Obstetra","Hematología","Hepatología",
            "Kinesiología","Nefrología","Neumonología","Neurología","Nutrición",
            "Odontología","Oftalmología","Oncología","Otorrinolaringología","Pediatra",
            "Psiquiatria","Reumatología","Traumatología y Ortopedia","Urología"));

    public static List<String> getEspecialidades() {
        return ESPECIALIDADES_LIST;
    }
    
}
