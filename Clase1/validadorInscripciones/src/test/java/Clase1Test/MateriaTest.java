package Clase1Test;

import Clase1.Materia;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MateriaTest {
    @Test
    public void matematica1NoTieneCorrelativas() {
        Materia matematica1 = new Materia("Matemática I");

        Assertions.assertFalse(matematica1.tieneCorrelativas());
    }

    @Test
    public void matematica2TieneCorrelativas() {
        Materia algebra = new Materia("Algebra");
        Materia matematica1 = new Materia("Matemática I");
        Materia matematica2 = new Materia("Matemática II");
        matematica2.addCorrelativa(algebra);
        matematica2.addCorrelativa(matematica1);

        Assertions.assertTrue(matematica2.tieneCorrelativas());
    }

}
