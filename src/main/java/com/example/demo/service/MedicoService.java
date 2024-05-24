package com.example.demo.service;

import com.example.demo.model.Medico;
import com.example.demo.repository.MedicoRepository;
import com.example.demo.service.inter.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public Medico cadastrarMedico(Medico medico) {
        if(medico == null) {
            throw new RuntimeException();
        }

        return medicoRepository.save(medico);
    }

    @Override
    public void alterarMedico(Medico medico) {
        if(medico == null) {
            throw new RuntimeException();
        }

        medicoRepository.save(medico);
    }

    @Override
    public void excluirMedico(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }

        medicoRepository.deleteById(id);
    }

    @Override
    public List listarMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico listarPorId(Long id) {
        return medicoRepository.findById(id).get();
    }
}
