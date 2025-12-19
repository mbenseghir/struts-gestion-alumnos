package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.AlumnoBean;

public class Index extends ActionSupport {

    private String dni;
    private AlumnoBean alumno;

    @Override
    public String execute() {

        // Validación simple del DNI
        if (dni == null || dni.trim().isEmpty()) {
            addFieldError("dni", "El DNI es obligatorio");
            return INPUT;
        }

        if (dni.length() != 9) {
            addFieldError("dni", "El DNI debe tener 9 caracteres");
            return INPUT;
        }

        // Buscar el alumno en memoria
        for (AlumnoBean a : RegistryAction.getAlumnos()) {
            if (a.getDni().equals(dni)) {
                this.alumno = a;
                break;
            }
        }

        return SUCCESS;
    }

    // Getter y Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public AlumnoBean getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoBean alumno) {
        this.alumno = alumno;
    }
}
