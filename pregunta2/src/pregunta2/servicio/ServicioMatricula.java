package pregunta2.servicio;

import pregunta2.repositorio.RepositorioAlumno;
import pregunta2.repositorio.RepositorioCurso;
import pregunta2.repositorio.RepositorioMatricula;

public class ServicioMatricula {
    private final RepositorioMatricula repositorio;
    private final RepositorioAlumno repositorioAlumno;
    private final RepositorioCurso repositorioCurso;
        public ServicioMatricula(RepositorioMatricula repositorio, RepositorioAlumno repositorioAlumno, RepositorioCurso repositorioCurso) {
            this.repositorio = repositorio;
            this.repositorioAlumno = repositorioAlumno;
            this.repositorioCurso = repositorioCurso;
        }
    
 }
