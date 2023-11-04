import clases.TransformaArrayAMayuscula;
import interfaces.ITransformador;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        TransformaArrayAMayuscula convertirString = new TransformaArrayAMayuscula();
        ArrayList<String> minusculas = new ArrayList<String>();
        List<String> mayusculas = new ArrayList<String>();

        minusculas.add("Hola");
        minusculas.add("que");
        minusculas.add("tal");
        minusculas.add("?");

        mayusculas = convertirString.convertirAMayusculas(minusculas);
        for (int i = 0; i < minusculas.size(); i++) {
            System.out.println(i + ": " + mayusculas.get(i));
        }
    }
}
