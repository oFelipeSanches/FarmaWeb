package com.example.demo.service;

import com.example.demo.model.Paciente;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.service.inter.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public void cadastrar(Paciente paciente) {
        if(paciente == null) {
            throw new RuntimeException();
        }

        pacienteRepository.save(paciente);
    }

    @Override
    public void alterar(Paciente paciente) {
        if(paciente == null) {
            throw new RuntimeException();
        }

        pacienteRepository.save(paciente);
    }

    @Override
    public void excluirPaciente(Long id) {
        if(id == null) {
            throw new RuntimeException();
        }

        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente buscarPacientePorId(Long id) {
        return pacienteRepository.findById(id).get();
    }
}
