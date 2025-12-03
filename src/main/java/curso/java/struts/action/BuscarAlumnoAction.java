package curso.java.struts.action;
import com.opensymphony.xwork2.ActionSupport;
import curso.java.struts.db.AlumnoMemoryDB;
import curso.java.struts.model.Alumno;
public class BuscarAlumnoAction extends ActionSupport {
 private String dni; private Alumno alumno;
 public String execute(){
   alumno = AlumnoMemoryDB.get(dni);
   return alumno!=null?SUCCESS:ERROR;
 }
 public String getDni(){return dni;} public void setDni(String v){dni=v;}
 public Alumno getAlumno(){return alumno;}
}
