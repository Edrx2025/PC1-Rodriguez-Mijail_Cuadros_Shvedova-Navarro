package pregunta2.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Matricula {
    private final String codigoAlumno;
    private final String codigoCurso;
    private final String periodo;
    private final LocalDate fecha;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.codigoAlumno);
        hash = 71 * hash + Objects.hashCode(this.codigoCurso);
        hash = 71 * hash + Objects.hashCode(this.periodo);
        hash = 71 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.codigoAlumno, other.codigoAlumno)) {
            return false;
        }
        if (!Objects.equals(this.codigoCurso, other.codigoCurso)) {
            return false;
        }
        if (!Objects.equals(this.periodo, other.periodo)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Matricula(String codigoAlumno, String codigoCurso, String periodo, LocalDate fecha) {
        this.codigoAlumno = codigoAlumno;
        this.codigoCurso = codigoCurso;
        this.periodo = periodo;
        this.fecha = fecha;
    }
}
