import java.util.Arrays;
import java.util.List;

public class AppColeccionInteger {
    public static void main(String[] args) {
//Crear una colección de números

        List<Integer> numeros = Arrays.asList(3,10,20,5);



        //for(Integer unNum : numeros)

        //	System.out.println(unNum);

        numeros.stream().forEach( unNum -> System.out.println(unNum));



        //OPERAR DE MANERA MASIVA EN TODA LA COLECCIÓN

        //ANALOGÍA DE .stream().allMatch()

		/*

		boolean unBooleano = true;

		for(Integer unNumero : numeros) {

			if( !(unNumero > 3))

				unBooleano = false;

		}*/
    }
}