package com.example.demo.service.inter;

import com.example.demo.model.Farmacia;

import java.util.List;

public interface IFarmaciaService {

    public void cadastrarFarmacia(Farmacia farmacia);

    public void alterarFarmacia(Farmacia farmacia);

    public void excluirFarmacia(Farmacia farmacia);

    public List<Farmacia> listarFarmacia();

    public Farmacia buscarFarmacia(Long id);
}
