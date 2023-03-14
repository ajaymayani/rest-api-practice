package com.example.restapi.controllers;

import com.example.restapi.payloads.EmployeeDto;
import com.example.restapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public ResponseEntity<?> loging() {
        return null;
    }

    @PostMapping("/register")
    public ResponseEntity<EmployeeDto> register(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(this.employeeService.addEmployee(employeeDto), HttpStatus.CREATED);
    }
}
