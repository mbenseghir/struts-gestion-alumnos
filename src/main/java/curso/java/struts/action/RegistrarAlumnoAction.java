package curso.java.struts.action;
import com.opensymphony.xwork2.ActionSupport;
import curso.java.struts.db.AlumnoMemoryDB;
import curso.java.struts.model.Alumno;
public class RegistrarAlumnoAction extends ActionSupport {
 private Alumno alumno = new Alumno();
 public String execute(){ AlumnoMemoryDB.add(alumno); return SUCCESS;}
 public Alumno getAlumno(){return alumno;} public void setAlumno(Alumno a){alumno=a;}
}
