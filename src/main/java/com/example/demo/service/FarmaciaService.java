package com.example.demo.service;

import com.example.demo.model.Farmacia;
import com.example.demo.repository.FarmaciaRepository;
import com.example.demo.service.inter.IFarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaService implements IFarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    @Override
    public void cadastrarFarmacia(Farmacia farmacia) {

    }

    @Override
    public void editarFarmacia(Farmacia farmacia) {

    }

    @Override
    public void excluirFarmacia(Farmacia farmacia) {

    }

    @Override
    public List<Farmacia> listarFarmacia() {
        return List.of();
    }

    @Override
    public Farmacia buscarFarmacia(Long id) {
        return null;
    }
}
