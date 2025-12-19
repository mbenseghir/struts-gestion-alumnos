# struts2-jetty-demo

## Descripción
Aplicación web desarrollada con **Struts 2** como parte del **Curso de Java**.  
La aplicación permite la **gestión básica de alumnos**, cumpliendo el patrón **MVC** y sin utilizar base de datos, almacenando la información **en memoria**.

---

## Funcionalidad
La aplicación consta de las siguientes funcionalidades:

- Página principal con un campo para introducir el **DNI del alumno**
- Búsqueda de alumno por DNI
- Enlace a un formulario para **dar de alta un nuevo alumno**
- Formulario de registro con **10 campos**:
  - DNI
  - Nombre
  - Apellidos
  - Email
  - Teléfono
  - Edad
  - Dirección
  - Ciudad
  - Curso
  - Observaciones
- Validaciones de campos mediante **Struts 2**
- Página de confirmación donde se muestran los datos del alumno
- Internacionalización mediante archivos `package.properties` y `package_es.properties`

---

## Tecnologías utilizadas
- Java 8
- Struts 2.3.24
- Maven
- JSP
- Jetty (plugin Maven)
- HTML

---

## Estructura del proyecto

src
└── main
├── java
│ └── org.demo.actions
│ ├── Index.java
│ ├── RegistryAction.java
│ └── AlumnoAction.java
│ └── beans
│ └── AlumnoBean.java
├── resources
│ ├── struts.xml
│ └── org/demo
│ ├── package.properties
│ └── package_es.properties
└── webapp
├── index.jsp
├── registryForm.jsp
└── welcome.jsp


---

## Ejecución del proyecto

Para ejecutar la aplicación en local:

```bash
mvn jetty:run



## Notas

- No se utiliza base de datos, toda la información se gestiona en memoria.

- La aplicación sigue el patrón Modelo–Vista–Controlador (MVC).

- Proyecto desarrollado con fines formativos.