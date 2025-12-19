package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.AlumnoBean;

import java.util.ArrayList;
import java.util.List;

public class RegistryAction extends ActionSupport {

    // Lista en memoria (sin base de datos)
    private static final List<AlumnoBean> alumnos = new ArrayList<>();

    private AlumnoBean alumno;

    // Mensajes i18n
    public static final String MESSAGE = "hello.message";
    public static final String TITTLE_FORM_MESSAGE = "form.tittle.message";

    private String message;
    private String formTittleMessage;

    @Override
    public String execute() {
        setMessage(getText(MESSAGE));
        setFormTittleMessage(getText(TITTLE_FORM_MESSAGE));

        // Si viene el alumno informado, lo guardamos
        if (alumno != null && alumno.getDni() != null) {
            alumnos.add(alumno);
            return SUCCESS;
        }

        // Primera carga del formulario
        return INPUT;
    }

    @Override
    public void validate() {

        if (alumno == null) return;

        if (alumno.getDni() == null || alumno.getDni().length() != 9) {
            addFieldError("alumno.dni", "DNI obligatorio y válido");
        }

        if (alumno.getNombre() == null || alumno.getNombre().isEmpty()) {
            addFieldError("alumno.nombre", "El nombre es obligatorio");
        }

        if (alumno.getEmail() == null || !alumno.getEmail().contains("@")) {
            addFieldError("alumno.email", "Email no válido");
        }

        if (alumno.getEdad() <= 0) {
            addFieldError("alumno.edad", "La edad debe ser mayor que 0");
        }
    }

    // ===== Getters / Setters =====

    public AlumnoBean getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoBean alumno) {
        this.alumno = alumno;
    }

    public static List<AlumnoBean> getAlumnos() {
        return alumnos;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormTittleMessage() {
        return formTittleMessage;
    }

    public void setFormTittleMessage(String formTittleMessage) {
        this.formTittleMessage = formTittleMessage;
    }
}
