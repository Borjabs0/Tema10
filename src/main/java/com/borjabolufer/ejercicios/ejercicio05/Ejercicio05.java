package com.borjabolufer.ejercicios.ejercicio05;

import net.datafaker.Faker;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Ejercicio05 {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    Faker faker = new Faker(new Locale("es", "ES"));
    public Ejercicio05(){
        for (int i = 0; i <= 10; i++) {
            String nombre = faker.name().name();
            Genero generoAleatorio = Genero.values()[faker.random().nextInt(0,1)];
            String fechaNacimiento = faker.date().birthday("dd/MM/yyyy");
            double altura = faker.number().randomDouble(2,1,2);
            double peso = faker.number().randomDouble(10,0,150);

            Paciente paciente = new Paciente(nombre, generoAleatorio, fechaNacimiento, altura, peso);
            pacientes.add(paciente);
        }
        System.out.println(pacientes);
        calcularEdad();

    }
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = 0;
        for (int i = 0; i <= 10; i++) {
            String fechaNacimiento = pacientes.get(i).getFechaNacimiento();
            LocalDate fechaNacimientoLocal = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            edad = Period.between(fechaNacimientoLocal, fechaActual).getYears();
        }
        return edad;
    }

    public int[] majorMenor(ArrayList<Paciente> pacientes){
        int[] indices = new int[2];
        int indiceMajor = 0;
        int indiceMenor = 0;


        return indices;
    }
}
