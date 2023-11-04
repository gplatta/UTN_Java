package interfaces;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ITransformador {
    public List<String> convertirAMayusculas(ArrayList<String> lista);
}
