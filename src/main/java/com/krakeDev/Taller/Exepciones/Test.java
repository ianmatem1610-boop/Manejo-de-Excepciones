package com.krakeDev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
     
        String telefonoPrueba = "123"; 
     

        try {
            
            ValidarContacto.validarTelefono(telefonoPrueba);
            
           
            GuardarContacto.guardar();
            
        
            LeerContacto.leer();
            
            log.info("Todo salió bien en el proceso del taller.");

        } catch (IllegalArgumentException e) {
           
            log.error("Teléfono inválido detectado: " + e.getMessage());
        }
    }
}