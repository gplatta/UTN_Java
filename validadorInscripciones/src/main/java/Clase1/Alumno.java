package Clase1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;
    private Date fechaNacimiento;
    List<Materia> materiasAprobadas;

    public Alumno(String nombre, String aepllido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public String getLegajo() {

        return legajo;
    }

    public void setLegajo(String legajo) {

        this.legajo = legajo;
    }

    public Date getFechaNacimiento() {

        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public List<Materia> materiasAprobadas() {

        return this.materiasAprobadas;
    }

    public void addMateriaAprobada(Materia mat) {

        this.materiasAprobadas.add(mat);
    }
}
