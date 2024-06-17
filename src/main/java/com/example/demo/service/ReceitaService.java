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
    public Receita cadastrarReceita(Receita receita) {
        if(receita == null) {
            throw new RuntimeException();
        }

        return receitaRepository.save(receita);
    }

    @Override
    public void alterarReceita(Receita receita) {
        if(receita == null) {
            throw new RuntimeException();
        }

        receitaRepository.save(receita);
    }

    @Override
    public void excluirReceita(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }

        receitaRepository.deleteById(id);
    }

    @Override
    public List<Receita> listarReceitas() {
        return receitaRepository.findAll();
    }

    @Override
    public Receita buscarPorId(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }
        return receitaRepository.findById(id).get();
    }
}
