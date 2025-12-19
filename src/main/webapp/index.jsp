<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inicio</title>
</head>
<body>

<h2>Buscar alumno por DNI</h2>

<s:form action="index" method="post">

    <s:textfield
        name="dni"
        key="form.dni.message"
        label="%{getText('form.dni.message')}" />

    <s:submit value="Buscar alumno"/>

</s:form>

<s:fielderror />

<hr/>

<h3>¿No existe el alumno?</h3>
<a href="registry">Dar de alta un nuevo alumno</a>

</body>
</html>
