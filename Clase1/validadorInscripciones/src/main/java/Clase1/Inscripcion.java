package Clase1;

import java.util.stream.Stream;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    // Con expresión lambda
    public boolean elAlumnoPuedeCursar() {
        return this.materia.getCorrelativas().stream().allMatch(materiaCorrelativa ->
               this.alumno.tieneLaCorrelativa(materiaCorrelativa));
    }

    public boolean inscripcionAprobada() {
        return (!this.materia.tieneCorrelativas() || elAlumnoPuedeCursar());
    }
    // -----------------------------------------------------------------------------------

    // Sin expresión lambda
    public boolean inscripcionAprobada2() {
        boolean fin = false, resultado = false;
        int i = 0;

        if (!this.materia.getCorrelativas().isEmpty()) {
            while (!fin && i < this.materia.getCorrelativas().size()) {
                if (this.alumno.getMateriasAprobadas().contains(this.materia.getCorrelativas().get(i)))
                    resultado = true;
                else {
                    resultado = false;
                    fin = true;
                }
                i++;
            }
        }
        else
            resultado = true;

        return resultado;
    }
    // ---------------------------------------------------------------------------------------------------
}
