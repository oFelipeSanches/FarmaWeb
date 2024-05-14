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
    public List<Paciente> listarPacientes() {
        return List.of();
    }

    @Override
    public void cadastrar(Paciente paciente) {

    }

    @Override
    public void alterar(Paciente paciente) {

    }

    @Override
    public void excluirPaciente(Long id) {

    }

    @Override
    public Paciente buscarPacientePorId(Long id) {
        return null;
    }
}
