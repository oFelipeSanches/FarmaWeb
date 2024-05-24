package com.example.demo.service.inter;

import com.example.demo.model.Farmacia;

import java.util.List;

public interface IFarmaciaService {

    public Farmacia cadastrarFarmacia(Farmacia farmacia);

    public void alterarFarmacia(Farmacia farmacia);

    public void excluirFarmacia(Long id);

    public List<Farmacia> listarFarmacia();

    public Farmacia buscarFarmacia(Long id);
}
