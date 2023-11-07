import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Vamos a crear un método
        // Va a tener como parámetro una lista de String
        // Va a retornar una lista de String transformada a mayúsculas

        List<String> frasesEjemplo = new ArrayList<String>();
        frasesEjemplo.add("Una frase");
        frasesEjemplo.add("otra frase");
        frasesEjemplo.add("última frase");

        PaseAMayuscula expresionLambda = (lista) -> {
                List<String> frases = new ArrayList<String>();
                for (String frase: frases)
                    frases.add(frase.toUpperCase());
                return frases;
                };

        List<String> frasesEnMayuscula = expresionLambda.aplicar(frasesEjemplo);

        // (PARAMETROS) -> (COMPORTAMIENTO)
        // Método stream() envuelve la colección tradicional para facilitar su utilización

        frasesEjemplo.stream().forEach(frase -> System.out.println(frase));

        //frasesEjemplo.stream().forEach(frase -> frasesEnMayuscula.add(frase.toUpperCase()));

        // Usando stream, se puede resolver la actividad 2 en una sola línea
        frasesEnMayuscula = frasesEjemplo.stream()
                .map( unString -> unString.toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> cambiarAMayusculas(List<String> frases) {
        List<String> otraListaConMayusculas = new ArrayList<String>();
        for (String frase: frases)
            otraListaConMayusculas.add(frase.toUpperCase());
        return otraListaConMayusculas;
    }
}
