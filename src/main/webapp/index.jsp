<%@ taglib prefix="s" uri="/struts-tags" %>
<h2>Buscar Alumno</h2>
<s:form action="buscar">
 <s:textfield name="dni" label="DNI"/>
 <s:submit value="Buscar"/>
</s:form>
<p><a href="registrar.jsp">Registrar nuevo alumno</a></p>
