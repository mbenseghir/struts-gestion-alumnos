<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:text name="form.tittle.message"/></title>
    <s:head/>
</head>

<body>

<h1><s:text name="form.tittle.message"/></h1>

<s:form action="registry" method="post">

    <s:fielderror/>

    <table>

        <tr>
            <td><s:text name="form.dni.message"/></td>
            <td><s:textfield name="alumno.dni"/></td>
        </tr>

        <tr>
            <td><s:text name="form.nombre.message"/></td>
            <td><s:textfield name="alumno.nombre"/></td>
        </tr>

        <tr>
            <td><s:text name="form.apellidos.message"/></td>
            <td><s:textfield name="alumno.apellidos"/></td>
        </tr>

        <tr>
            <td><s:text name="form.email.message"/></td>
            <td><s:textfield name="alumno.email"/></td>
        </tr>

        <tr>
            <td><s:text name="form.telefono.message"/></td>
            <td><s:textfield name="alumno.telefono"/></td>
        </tr>

        <tr>
            <td><s:text name="form.edad.message"/></td>
            <td><s:textfield name="alumno.edad"/></td>
        </tr>

        <tr>
            <td><s:text name="form.direccion.message"/></td>
            <td><s:textfield name="alumno.direccion"/></td>
        </tr>

        <tr>
            <td><s:text name="form.ciudad.message"/></td>
            <td><s:textfield name="alumno.ciudad"/></td>
        </tr>

        <tr>
            <td><s:text name="form.curso.message"/></td>
            <td><s:textfield name="alumno.curso"/></td>
        </tr>

        <tr>
            <td><s:text name="form.observaciones.message"/></td>
            <td><s:textarea name="alumno.observaciones"/></td>
        </tr>

        <tr>
            <td colspan="2">
                <s:submit value="Registrar alumno"/>
            </td>
        </tr>

    </table>

</s:form>

<br/>

<a href="index">Volver al inicio</a>

</body>
</html>
