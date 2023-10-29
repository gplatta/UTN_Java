package Clase1Test;

import Clase1.Alumno;
import Clase1.Materia;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AlumnoTest {

    @Test
    public void juanTieneLaCorrelativaAprobada() {
        Alumno juan = new Alumno("Juan","Perez");
        Materia algebra = new Materia("Algebra");
        Materia matematica1 = new Materia("Matemática I");
        Materia matematica2 = new Materia("Matemática II");
        matematica2.addCorrelativa(matematica1);
        matematica2.addCorrelativa(algebra);

        juan.addMateriaAprobada(matematica1);
        juan.addMateriaAprobada(algebra);

        Assertions.assertTrue(juan.tieneLaCorrelativa(matematica1));
    }

    @Test
    public void juanNoTieneLaCorrelativaAprobada() {
        Alumno juan = new Alumno("Juan","Perez");
        Materia algebra = new Materia("Algebra");
        Materia matematica1 = new Materia("Matemática I");
        Materia matematica2 = new Materia("Matemática II");
        matematica2.addCorrelativa(matematica1);
        matematica2.addCorrelativa(algebra);

        juan.addMateriaAprobada(matematica1);

        Assertions.assertFalse(juan.tieneLaCorrelativa(algebra));
    }
}
