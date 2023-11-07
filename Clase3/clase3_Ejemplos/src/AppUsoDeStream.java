import java.util.*;
import java.util.stream.Collectors;

public class AppUsoDeStream {
    public static void main(String[] args) {
        List<Persona> listaDePersonas = new ArrayList<Persona>();

        listaDePersonas.add(new Persona("Nahuel", 20));

        listaDePersonas.add(new Persona("Mateo", 10));

        listaDePersonas.add(new Persona("Julia", 30));



        //A partir de un listado de personas, crear o quedarme con un listado de nombres

        List<String> nombreDePersonas =

                //transformo una List<Persona> a un Stream<Persona>

                listaDePersonas.stream()

                        //transformo la coleccion de personas, y me quedo solo con el nomobre

                        .map( unaPersona -> unaPersona.getNombre())

                        //lo vuelvo a transformar en una colección List<>

                        .collect(Collectors.toList());



        //A partir de un listado de nombres, crear un listado de personas

        List<Persona> obtenerListaDePersonasAPartirDeNombres =

                nombreDePersonas.stream()

                        .map( nombrePersona -> new Persona(nombrePersona))

                        .collect(Collectors.toList());

        //Armar una coleccion de numeros con las edades

        List<Integer> listaDeEdades =

                listaDePersonas.stream().map( unaPersona -> unaPersona.getEdad())

                        .collect(Collectors.toList());



        //Aplanación de colecciones

        Integer edadMaxima = Collections.max(listaDeEdades);

        Integer edadMin = Collections.min(listaDeEdades);



        //Quiero saber la edad máxima de las personas

        OptionalInt edadMax = listaDePersonas.stream()

                .mapToInt( unaPersona -> unaPersona.getEdad())

                .max();


        //Aplanación de colecciones


        //Quiero saber la edad máxima de las personas

        OptionalInt edadMax2 = listaDePersonas.stream()

                .mapToInt( unaPersona -> unaPersona.getEdad())

                .max();



        OptionalDouble promedioDeEdad = listaDePersonas.stream()

                .mapToInt( persona -> persona.getEdad())

                .average();



        String todosLosNombres =

                listaDePersonas.stream()

                        .map( unaPersona -> unaPersona.getNombre())

                        .collect(Collectors.joining(", "));



        System.out.println(todosLosNombres);
    }
}
