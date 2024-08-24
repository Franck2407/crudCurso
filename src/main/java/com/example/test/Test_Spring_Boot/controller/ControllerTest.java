package com.example.test.Test_Spring_Boot.controller;

import com.example.test.Test_Spring_Boot.tdo.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// establecer escuchadores HTTP
@RestController
@RequestMapping("/test")
public class ControllerTest {

    // metodos de consulta o de obtencion
    @RequestMapping(value = "/print/{value}/consol", method = RequestMethod.GET)
    public ResponseEntity<Response> getMethod(@PathVariable String value, @RequestParam String nombre,@RequestParam String apellido){
        var response = new Response(HttpStatus.OK,"Operación exitosa", value + "____"+ nombre+"___"+ apellido);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // actualizar recurso
    @PutMapping("/print/{value}/consol")
    public ResponseEntity<Response> putMethod(@PathVariable String value, @RequestParam String nombre,@RequestParam String apellido){
        var response = new Response(HttpStatus.OK,"Operación exitosa", value + "____"+ nombre+"___"+ apellido);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // crear un recurso
    @PostMapping("/print/{value}/consol")
    public ResponseEntity<Response> postMethod(@PathVariable String value, @RequestParam String nombre,@RequestParam String apellido){
        var response = new Response(HttpStatus.OK,"Operación exitosa", value + "____"+ nombre+"___"+ apellido);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // elimina un recurso
    @DeleteMapping("/print/{value}/consol")
    public ResponseEntity<Response> deletedMethod(@PathVariable String value, @RequestParam String nombre,@RequestParam String apellido){
        var response = new Response(HttpStatus.OK,"Operación exitosa", value + "____"+ nombre+"___"+ apellido);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
