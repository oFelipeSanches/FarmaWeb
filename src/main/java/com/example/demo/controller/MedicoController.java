package com.example.demo.controller;

import com.example.demo.model.Medico;
import com.example.demo.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    public MedicoController() {
        super();
        this.medicoService = new MedicoService();
    }

    @GetMapping(path = "/listarMedicos")
    public List<Medico> listarMedicos() {
        return medicoService.listarMedicos();
    }

    @PostMapping(path = "/cadastrarMedicos")
    public ResponseEntity<Medico> cadastrarMedicos(@RequestBody Medico medico) {
        System.out.println(medico.getNome());
        return new ResponseEntity<Medico>(medicoService.cadastrarMedico(medico), HttpStatus.OK);
    }
}
