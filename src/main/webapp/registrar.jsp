<%@ taglib prefix="s" uri="/struts-tags" %>
<h2>Registrar Alumno</h2>
<s:form action="registrar">
 <s:textfield name="alumno.dni" label="DNI"/>
 <s:textfield name="alumno.nombre" label="Nombre"/>
 <s:textfield name="alumno.apellidos" label="Apellidos"/>
 <s:textfield name="alumno.email" label="Email"/>
 <s:textfield name="alumno.telefono" label="Teléfono"/>
 <s:textfield name="alumno.direccion" label="Dirección"/>
 <s:textfield name="alumno.ciudad" label="Ciudad"/>
 <s:textfield name="alumno.cp" label="Código Postal"/>
 <s:textfield name="alumno.nacimiento" label="Nacimiento"/>
 <s:textfield name="alumno.curso" label="Curso"/>
 <s:submit value="Guardar"/>
</s:form>
