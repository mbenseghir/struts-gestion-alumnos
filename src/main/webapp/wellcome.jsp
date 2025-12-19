<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:text name="hello.message"/></title>
    <s:head/>
</head>

<body>

<h1>Datos del alumno</h1>

<s:if test="alumno != null">

    <table border="1" cellpadding="5">

        <tr>
            <th>DNI</th>
            <td><s:property value="alumno.dni"/></td>
        </tr>

        <tr>
            <th>Nombre</th>
            <td><s:property value="alumno.nombre"/></td>
        </tr>

        <tr>
            <th>Apellidos</th>
            <td><s:property value="alumno.apellidos"/></td>
        </tr>

        <tr>
            <th>Email</th>
            <td><s:property value="alumno.email"/></td>
        </tr>

        <tr>
            <th>Teléfono</th>
            <td><s:property value="alumno.telefono"/></td>
        </tr>

        <tr>
            <th>Edad</th>
            <td><s:property value="alumno.edad"/></td>
        </tr>

        <tr>
            <th>Dirección</th>
            <td><s:property value="alumno.direccion"/></td>
        </tr>

        <tr>
            <th>Ciudad</th>
            <td><s:property value="alumno.ciudad"/></td>
        </tr>

        <tr>
            <th>Curso</th>
            <td><s:property value="alumno.curso"/></td>
        </tr>

        <tr>
            <th>Observaciones</th>
            <td><s:property value="alumno.observaciones"/></td>
        </tr>

    </table>

</s:if>

<s:else>
    <p>No hay información del alumno.</p>
</s:else>

<br/>

<a href="index">Volver al inicio</a>

</body>
</html>
