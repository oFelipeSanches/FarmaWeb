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
    public Medicamentos cadastrarMedicamentos(Medicamentos medicamentos) {
        if(medicamentos == null) {
            throw new RuntimeException();
        }

        return medicamentosRepository.save(medicamentos);
    }

    @Override
    public void alterarMedicamentos(Medicamentos medicamentos) {
        if(medicamentos == null) {
            throw new RuntimeException();
        }

        medicamentosRepository.save(medicamentos);
    }

    @Override
    public void excluirMedicamentos(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }

        medicamentosRepository.deleteById(id);
    }

    @Override
    public List<Medicamentos> listarMedicamentos() {
        return medicamentosRepository.findAll();
    }

    @Override
    public Medicamentos buscarPorId(Long id) {
        return medicamentosRepository.findById(id).get();
    }
}
