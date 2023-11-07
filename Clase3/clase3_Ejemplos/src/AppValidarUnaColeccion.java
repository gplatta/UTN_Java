import java.util.Arrays;
import java.util.List;

public class AppValidarUnaColeccion {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3,10,20,5);

        boolean validarUnaCondicion = numeros.stream().allMatch( numero -> numero > 3);

        System.out.println("Ejemplo de stream.allMatch en donde valido que todos los números sean mayores a 3");

        System.out.println(validarUnaCondicion);



		/*ANALOGÍA DE .stream().anyMatch()

		boolean unBooleano = false;

		for(Integer unNumero : numeros) {

			if(unNumero > 3)

				unBooleano = true;

		}*/

        System.out.println("Ejemplo de stream().anyMatch(): "+

                numeros.stream().anyMatch( numero -> numero > 3)

        );
    }
}
