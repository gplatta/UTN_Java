package org.example;

import Clase1.Alumno;
import Clase1.Inscripcion;
import Clase1.Materia;

public class App {
    public static void main(String[] args) {
        Alumno juan = new Alumno("Juan", "Garcia");
        Alumno pedro = new Alumno("Pedro", "Montoya");
        Alumno lucia = new Alumno("Lucía", "Mendoza");
        Alumno maria = new Alumno("Maria", "Escobar");
        Alumno jorge = new Alumno("Jorge", "Villegas");

        // Materias sin correlativas
        Materia matematica1 = new Materia("Matemática I");
        Materia fisica1 = new Materia("Física I");
        Materia programacion1 = new Materia("Programación I");

        // Materias con correlativas
        Materia matematica2 = new Materia("Matematica II");
        matematica2.addCorrelativa(matematica1);

        Materia fisica2 = new Materia("Física II");
        fisica2.addCorrelativa(fisica1);
        fisica2.addCorrelativa(matematica1);

        Materia fisica3 = new Materia("Física III");
        fisica3.addCorrelativa(matematica1);
        fisica3.addCorrelativa(fisica2);

        Materia programacion2 = new Materia("Programación II");
        programacion2.addCorrelativa(programacion1);
        programacion2.addCorrelativa(matematica1);

        Materia programacion3 = new Materia("Programación II");
        programacion3.addCorrelativa(fisica2);
        programacion3.addCorrelativa(matematica2);
        programacion3.addCorrelativa(programacion2);

        // Materias aprobadas de cada estudiante
        juan.addMateriaAprobada(matematica1);
        juan.addMateriaAprobada(programacion1);

        pedro.addMateriaAprobada(matematica2);
        pedro.addMateriaAprobada(matematica1);
        pedro.addMateriaAprobada(fisica1);
        pedro.addMateriaAprobada(programacion1);

        lucia.addMateriaAprobada(matematica1);
        lucia.addMateriaAprobada(fisica1);
        lucia.addMateriaAprobada(programacion1);
        lucia.addMateriaAprobada(matematica2);
        lucia.addMateriaAprobada(fisica2);

        maria.addMateriaAprobada(matematica1);
        maria.addMateriaAprobada(fisica1);

        jorge.addMateriaAprobada(fisica1);
        jorge.addMateriaAprobada(matematica1);
        jorge.addMateriaAprobada(programacion1);
        jorge.addMateriaAprobada(fisica2);
        jorge.addMateriaAprobada(programacion2);

        // Inscripciones
        Inscripcion juanAFisica2 = new Inscripcion(juan, fisica2);                 // no válida, no tiene física I
        Inscripcion pedroAFisica2 = new Inscripcion(pedro, fisica2);               // válida
        Inscripcion luciaAFisica3 = new Inscripcion(lucia, fisica3);               // válida
        Inscripcion mariaAProgramacion1 = new Inscripcion(maria, programacion1);   // válida
        Inscripcion jorgeAProgramacion3 = new Inscripcion(jorge, programacion3);   // no válida, no tiene matemática II

        if (jorgeAProgramacion3.inscripcionAprobada())  {
            System.out.println("Inscripción aprobada");
        }
        else {
            System.out.println("Inscripción desaprobada");
        }
    }
}

