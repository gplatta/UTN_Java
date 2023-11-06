import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
       List<String> minusculas = new ArrayList<>();
       List<String> mayusculas;

       minusculas.add("Hola que");
       minusculas.add(" tal");
       minusculas.add("?");

       mayusculas = transformar(minusculas, (cadena) -> cadena.toUpperCase());

       System.out.println("Lista transformada a mayúsculas: " + mayusculas);
    }
    public static List<String> transformar(List<String> lista, ITransformador convertir) {
        List<String> otraLista = new ArrayList<>();
        for (String cadena: lista) {
            otraLista.add(convertir.aplicar(cadena));
        }
        return otraLista;
    }
}
