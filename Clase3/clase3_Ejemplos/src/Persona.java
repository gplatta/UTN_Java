public class Persona {
    Integer edad;
    String nombre;

    public Persona(String nombre) {

        this.setNombre(nombre);

    }

    public Persona(String nombre, Integer edad) {

        this.setEdad(edad);

        this.setNombre(nombre);

    }

    public Integer getEdad() {

        return edad;

    }

    public void setEdad(Integer edad) {

        this.edad = edad;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }
}
