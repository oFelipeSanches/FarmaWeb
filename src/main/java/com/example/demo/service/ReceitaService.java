package com.example.demo.service;

import com.example.demo.model.Receita;
import com.example.demo.repository.ReceitaRepository;
import com.example.demo.service.inter.IReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService implements IReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    @Override
    public void cadastrarReceita(Receita receita) {

    }

    @Override
    public void alterarReceita(Receita receita) {

    }

    @Override
    public void excluirReceita(Receita receita) {

    }

    @Override
    public List<Receita> listarReceitas() {
        return List.of();
    }

    @Override
    public Receita buscarPorId(Long id) {
        return receitaRepository.findById(id).get();
    }
}
