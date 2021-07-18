package com.javyhuerta.logs.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LogsController {

	private static final Logger log = LoggerFactory.getLogger(LogsController.class);
	
    @GetMapping("/logs")
    public ResponseEntity<?> logs(){
    	log.info("Entro a endpoind logs");
        Map<String,Object> response = new HashMap<>();
        response.put("titulo", "Bienvenido al blog");
        response.put("descripcion", "Aprende a separar tu archivo de properties del proyecto");
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
    }

}
