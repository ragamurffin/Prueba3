/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
/**
 *
 * @author fr.santana
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         staticFiles.location("publico");
     
         get("/", (request, response) -> {
          
            
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("title", "Inicio");
           
            
            return new ModelAndView(attributes, "inicio.ftl");
        }, new FreeMarkerEngine());
    
          get("/listas", (request, response) -> {
          
            int numeros[]=new int[100];
            
            for(int i=0;i<100;i++) {
                numeros[i]=i+1;}
            
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("title", "Listas");
           
            attributes.put("loteria",numeros);
            
            return new ModelAndView(attributes, "listas.ftl");
        }, new FreeMarkerEngine());
    
     get("/saludos", (request, response) -> {
            String nombre;
            if(request.queryParams("nombre")!=null)
                nombre=request.queryParams("nombre");
            else
                nombre="Rafael";
//request.params("username");
            
            Map<String, Object> attributes = new HashMap<>();
            
            attributes.put("mensaje", "Hola Mundo!");
            attributes.put("usuario",nombre);
            attributes.put("fecha", new Date().toString());
            
            return new ModelAndView(attributes, "pagina.ftl");
        }, new FreeMarkerEngine());
    }
    
}
