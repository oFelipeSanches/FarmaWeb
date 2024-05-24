package com.example.demo.controller;

import com.example.demo.model.Farmacia;
import com.example.demo.service.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {

    @Autowired
    private FarmaciaService farmaciaService;

    public FarmaciaController() {
        super();
        this.farmaciaService = new FarmaciaService();
    }

    @GetMapping(path = "/listarFarmacias")
    public List<Farmacia> listarFarmacia() {
        return farmaciaService.listarFarmacia();
    }

    @PostMapping(path = "/cadastrarFarmacia")
    public ResponseEntity<Farmacia> cadastrarFarmacia(@RequestBody Farmacia farmacia) {
        System.out.println(farmacia.getNome());
        return new ResponseEntity<Farmacia>(farmaciaService.cadastrarFarmacia(farmacia), HttpStatus.OK);
    }

}
