package com.app.appH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppH2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppH2Application.class, args);
	}

	// https://www.youtube.com/watch?v=hzEpwm_Ew7I&ab_channel=ElivarLargo
	
	// Cuando utilizas una base de datos H2 (es decir en tu propia memoria del ordenador)
	// la base de datos solo funciona y tiene datos cuando la aplicacion esta en ejecucion
	// cuando se para el programa la base de datos se destruye y todo lo que contiene
	// viene muy bien para hacer pruebas. La configuracion de la misma se hace en el 
	// archivo properties
	
	// SQL Utilizadas: 
	// ALTER TABLE AUTORES RENAME COLUMN PAISORIGEN TO PAIS_ORIGEN;
	// ALTER TABLE usuarios ALTER COLUMN ID_USUARIO INT AUTO_INCREMENT;
	// ALTER TABLE usuarios ALTER COLUMN correo TYPE CHARACTER VARYING(255);
}
