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
    public Farmacia cadastrarFarmacia(Farmacia farmacia) {
        if(farmacia == null) {
            throw new RuntimeException();
        }

        return farmaciaRepository.save(farmacia);
    }

    @Override
    public void alterarFarmacia(Farmacia farmacia) {
        if(farmacia == null) {
            throw new RuntimeException();
        }

        farmaciaRepository.save(farmacia);
    }

    @Override
    public void excluirFarmacia(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }

        farmaciaRepository.deleteById(id);
    }

    @Override
    public List<Farmacia> listarFarmacia() {
        return farmaciaRepository.findAll();
    }

    @Override
    public Farmacia buscarFarmacia(Long id) {
        return farmaciaRepository.findById(id).get();
    }
}
