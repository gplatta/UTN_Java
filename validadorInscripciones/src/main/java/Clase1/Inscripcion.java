package Clase1;
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean inscripcionAprobada() {
        boolean aprobada = false;

        if (!materia.getCorrelativas().isEmpty()) {
            boolean fin = false;
            int i = 0;
            while (!fin && (i < this.materia.getCorrelativas().size())) {
                Materia mat = this.materia.getCorrelativas().get(i);
                if (this.alumno.getMateriasAprobadas().contains(mat))
                    aprobada = true;
                else {
                    aprobada = false;
                    fin = true;
                }
                i++;
            }
        }
        else
            aprobada = true;

        return aprobada;
    }
}
