package Clase1Test;

import Clase1.Alumno;
import Clase1.Inscripcion;
import Clase1.Materia;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InscripcionTest {
    
    @Test
    public void juanPuedeAnotarseAFisica2() {
        Alumno juan = new Alumno("Juan","apellido");
        Materia matematica1 = new Materia("Matemática I");
        Materia fisica1 = new Materia("Física I");
        Materia fisica2 = new Materia("Física II");
        fisica2.addCorrelativa(matematica1);
        fisica2.addCorrelativa(fisica1);
        juan.addMateriaAprobada(matematica1);
        juan.addMateriaAprobada(fisica1);

        Inscripcion inscripcionDeJuanAFisica2 = new Inscripcion(juan,fisica2);

        Assertions.assertTrue(inscripcionDeJuanAFisica2.inscripcionAprobada());
    }

    @Test
    public void juanNoPuedeAnotarseBaseDeDatos() {
        Alumno juan = new Alumno("Juan","apellido");

        Materia matematica1 = new Materia("Matemática I");
        Materia fisica1 = new Materia("Física I");
        Materia algebra = new Materia("Algebra");
        Materia fisica2 = new Materia("Física II");
        fisica2.addCorrelativa(matematica1);
        fisica2.addCorrelativa(fisica1);
        Materia programacion1 = new Materia("Programacíon I");
        Materia programacion2 = new Materia("Programación II");
        programacion2.addCorrelativa(programacion1);
        programacion2.addCorrelativa(matematica1);
        Materia baseDeDatos = new Materia("Base de Datos");
        baseDeDatos.addCorrelativa(algebra);
        baseDeDatos.addCorrelativa(programacion2);

        juan.addMateriaAprobada(matematica1);
        juan.addMateriaAprobada(fisica1);
        juan.addMateriaAprobada(fisica2);
        juan.addMateriaAprobada(programacion1);
        juan.addMateriaAprobada(programacion2);

        Inscripcion inscripcionDeJuanABaseDeDatos = new Inscripcion(juan,baseDeDatos);

        Assertions.assertFalse(inscripcionDeJuanABaseDeDatos.inscripcionAprobada());
    }
}
