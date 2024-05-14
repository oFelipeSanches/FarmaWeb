package com.example.demo.service;

import com.example.demo.model.Medicamentos;
import com.example.demo.repository.MedicamentosRepository;
import com.example.demo.service.inter.IMedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentosService implements IMedicamentosService {

    @Autowired
    private MedicamentosRepository medicamentosRepository;

    @Override
    public void cadastrarMedicamentos(Medicamentos medicamentos) {

    }

    @Override
    public void alterarMedicamentos(Medicamentos medicamentos) {

    }

    @Override
    public void excluirMedicamentos(Medicamentos medicamentos) {

    }

    @Override
    public List<Medicamentos> listarMedicamentos() {
        return List.of();
    }

    @Override
    public Medicamentos buscarPorId(Long id) {
        return medicamentosRepository.findById(id).get();
    }
}
