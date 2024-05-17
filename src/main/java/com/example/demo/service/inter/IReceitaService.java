package com.example.demo.service.inter;

import com.example.demo.model.Receita;

import java.util.List;

public interface IReceitaService {

    public void cadastrarReceita(Receita receita);

    public void alterarReceita(Receita receita);

    public void excluirReceita(Long id);

    public List<Receita> listarReceitas();

    public Receita buscarPorId(Long id);

}
