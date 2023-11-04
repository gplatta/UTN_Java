package clases;

import interfaces.ITransformador;

import java.util.ArrayList;
import java.util.List;

public class TransformaArrayAMayuscula implements ITransformador {
        public List<String> convertirAMayusculas(ArrayList<String> lista) {
            List<String> resultado = new ArrayList<>();
            lista.stream().forEach(palabra -> {
                int i = 0;
                resultado.add(palabra.toUpperCase());
                i++;
            });
            return resultado;
        }
}
