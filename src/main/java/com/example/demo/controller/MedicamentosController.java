package com.example.demo.controller;

import com.example.demo.model.Medicamentos;
import com.example.demo.service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentosController {

    @Autowired
    private MedicamentosService medicamentosService;

    public MedicamentosController() {
        super();
        this.medicamentosService = new MedicamentosService();
    }

    @GetMapping(path = "/listarMedicamentos")
    public List<Medicamentos> listarMedicamentos() {
        return medicamentosService.listarMedicamentos();
    }

    @PostMapping(path = "/cadastrarMedicamentos")
    public ResponseEntity cadastrarMedicamentos(@RequestBody Medicamentos medicamentos) {
        System.out.println(medicamentos.getNome());
        return new ResponseEntity<Medicamentos>(medicamentosService.cadastrarMedicamentos(medicamentos), HttpStatus.OK);
    }

}
