package com.example.demo.controller;

import com.example.demo.model.Paciente;
import com.example.demo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    public PacienteController() {
        super();
        this.pacienteService = new PacienteService();
    }

    @GetMapping(path = "/listarPacientes")
    public List<Paciente> listarPacientes() {
        return pacienteService.listarPacientes();
    }

    @PostMapping(path = "/cadastrarPacientes")
    public ResponseEntity<Paciente> cadastratPaciente(@RequestBody Paciente paciente) {
        System.out.println(paciente.getNome());
        return new ResponseEntity<Paciente>(pacienteService.cadastrar(paciente), HttpStatus.OK);
    }

}
