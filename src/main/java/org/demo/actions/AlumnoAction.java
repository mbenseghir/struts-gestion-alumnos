package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.AlumnoBean;

public class AlumnoAction extends ActionSupport {

    private AlumnoBean alumno;

    @Override
    public String execute() {
        // En una app real aquí buscaríamos el alumno en memoria por DNI
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (alumno == null) {
            addActionError("No se ha recibido información del alumno");
            return;
        }

        if (alumno.getDni() == null || alumno.getDni().length() != 9) {
            addFieldError("alumno.dni", "DNI no válido");
        }

        if (alumno.getNombre() == null || alumno.getNombre().isEmpty()) {
            addFieldError("alumno.nombre", "El nombre es obligatorio");
        }
    }

    public AlumnoBean getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoBean alumno) {
        this.alumno = alumno;
    }
}
