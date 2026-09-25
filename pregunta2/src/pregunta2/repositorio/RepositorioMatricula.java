package pregunta2.repositorio;

import java.util.List;
import pregunta2.Modelo.Matricula;


public interface RepositorioMatricula {
    void guardar(Matricula m);
    boolean existe(String codigoAlumno, String codigoCurso, String periodo);
    List<Matricula> porPeriodo(String periodo);
    List<Matricula> porAlumno(String codigoAlumno);
    List<Matricula> porCurso(String codigoCurso);
}
