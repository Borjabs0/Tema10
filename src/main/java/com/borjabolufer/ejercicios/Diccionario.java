package com.borjabolufer.ejercicios;

import java.security.KeyStore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    public Diccionario() {
        HashMap<String, String> diccionario = new HashMap<String,String>();
        diccionario.put("Animal"," Ser orgánico que vive, siente y se mueve por propio impulso.");
        diccionario.put("Perro"," Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño.");
        diccionario.put("Moneda"," Pieza de oro, plata, cobre u otro metal, regularmente en forma de disco y acuñada con los distintivos elegidos por la autoridad emisora para acreditar su legitimidad y valor, y, por ext., billete o papel de curso legal.");

        for (Map.Entry e : diccionario.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
//        Set<String> claves =  diccionario.keySet();
        System.out.println();
        System.out.println("Claves: ");
        for (Map.Entry claves : diccionario.entrySet()){
            System.out.println("\t" + "- " + claves.getKey());
        }
        System.out.println("Valores: ");
        for (Map.Entry valores : diccionario.entrySet()){
            System.out.println("\t" + "-" + valores.getValue());
        }

//        System.out.println("Valores");
//        Collection<String> valor = diccionario.values();
//        System.out.println(valor);
    }
}
