/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.helloworld.principal;

import com.google.gson.Gson;
import ec.edu.espe.distribuidas.helloworld.basededatos.Persona;

/**
 *
 * @author dennys
 */
public class HelloWorldLauncher {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");
        Gson gson = new Gson();
        Persona p = new Persona();
        p.setApellido("Camacho");
        p.setNombre("Shanela");
        p.setEdad(21);
        System.out.println("" + gson.toJson(p));

        String dennysJson = "{\"nombre\":\"Dennys\",\"apellido\":\"Quiroz\",\"edad\":23}";
        
        Persona dennys = gson.fromJson(dennysJson, Persona.class);
        System.out.println("" + dennys.getNombre());
        
    }
}
