package com.borjabolufer.ejercicios.ejercicio05;
import java.util.Objects;

public class Paciente {
    private static int ID_AUTONUMERICO = 0;
    private int id;
    private final String nombre;
    private final Genero genero;
    private final String fechaNacimiento;
    private final double altura;
    private final double peso;

    public Paciente(String nombre, Genero genero, String fechaNacimiento, double altura, double peso) {
        this.id = ID_AUTONUMERICO++;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        if (id != paciente.id) return false;
        if (Double.compare(altura, paciente.altura) != 0) return false;
        if (Double.compare(peso, paciente.peso) != 0) return false;
        if (!Objects.equals(nombre, paciente.nombre)) return false;
        if (genero != paciente.genero) return false;
        return Objects.equals(fechaNacimiento, paciente.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        temp = Double.doubleToLongBits(altura);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        return "Paciente" +id+ "[" +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", fechaNacimiento=" + fechaNacimiento +
                ", altura=" + altura +
                ", peso=" + peso +
                ']';
    }
}
