package com.example.demo.controller;

import com.example.demo.model.Receita;
import com.example.demo.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    public ReceitaController() {
        super();
        this.receitaService = new ReceitaService();
    }

    @GetMapping(path = "/listarReceitas")
    public List<Receita> listarReceitas() {
        return receitaService.listarReceitas();
    }

    @PostMapping(path = "/cadastrarReceitas")
    public ResponseEntity<Receita> cadastrarReceita(@RequestBody Receita receita) {
        System.out.println(receita.getMedicamentos());
        return new ResponseEntity<Receita>(receitaService.cadastrarReceita(receita), HttpStatus.OK);
    }

}
