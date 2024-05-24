package com.example.demo.service.inter;

import com.example.demo.model.Paciente;

import java.util.List;

public interface IPacienteService {

    public List<Paciente> listarPacientes();

    public Paciente cadastrar(Paciente paciente);

    public void alterar(Paciente paciente);

    public void excluirPaciente(Long id);

    public Paciente buscarPacientePorId(Long id);

}
