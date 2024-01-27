package com.ramjava.empleado.servicio.controller;

import com.ramjava.empleado.servicio.dto.EmpleadoResponse;
import com.ramjava.empleado.servicio.entity.Empleado;
import com.ramjava.empleado.servicio.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
    @Autowired
    EmpleadoService empService;

    @GetMapping("/empleados/{id}")
    Empleado getEmployeeDetails(@PathVariable("id") int id) {
    //ResponseEntity<EmpleadoResponse> getEmployeeDetails(@PathVariable("id") int id) {
        // In a controller, best practice is to use DTO instead of making direct call from the DB
        Empleado emp = empService.getEmployeeById(id);
        //EmpleadoResponse empResponse = empService.getEmployeeById(id);
        return emp;
        //return ResponseEntity.status(HttpStatus.OK).body(empResponse);
    }
}
