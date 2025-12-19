package org.demo.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name = Action.SUCCESS, location = "welcome.jsp"),
    @Result(name = Action.INPUT, location = "index.jsp")
})
public class Index extends ActionSupport {

    private String dni;

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

        // Aquí se podría buscar el alumno en memoria
        return SUCCESS;
    }

    // Getter y Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
