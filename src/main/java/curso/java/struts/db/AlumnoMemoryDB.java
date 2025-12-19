package curso.java.struts.db;
import java.util.*; 
import curso.java.struts.model.Alumno;
public class AlumnoMemoryDB {
    private static Map<String, Alumno> alumnos = new HashMap<>();
    public static Alumno get(String dni){ return alumnos.get(dni);}
    public static void add(Alumno a){ alumnos.put(a.getDni(), a);}
    public static Collection<Alumno> all(){ return alumnos.values();}
}
