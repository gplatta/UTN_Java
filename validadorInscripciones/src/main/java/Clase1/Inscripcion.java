package Clase1;

import java.util.stream.Stream;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean elAlumnoPuedeCursar() {
        return this.materia.getCorrelativas().stream().allMatch(materiaCorrelativa ->
               this.alumno.tieneLaCorrelativa(materiaCorrelativa));
    }

    public boolean inscripcionAprobada() {
        return (!this.materia.tieneCorrelativas() || elAlumnoPuedeCursar());
    }
}
