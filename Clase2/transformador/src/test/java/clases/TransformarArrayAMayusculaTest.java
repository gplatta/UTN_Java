package clases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TransformarArrayAMayusculaTest {

    @Test
    public void transformaAMayusucla() {
        TransformaArrayAMayuscula convertirString = new TransformaArrayAMayuscula();
        ArrayList<String> minusculas = new ArrayList<String>();
        List<String> mayusculas = new ArrayList<String>();

        minusculas.add("Hola");
        minusculas.add("que");
        minusculas.add("tal");
        minusculas.add("?");

        mayusculas.add("HOLA");
        mayusculas.add("QUE");
        mayusculas.add("TAL");
        mayusculas.add("?");

        Assertions.assertEquals(mayusculas, convertirString.convertirAMayusculas(minusculas));
    }
}
