package com.example.demo.service.inter;

import com.example.demo.model.Medico;

import java.util.List;
public interface IMedicoService {

    public void cadastrarMedico(Medico medico);

    public void alterarMedico(Medico medico);

    public void excluirMedico(Long id);

    public Medico listarPorId(Long id);

    public List<Medico> listarMedicos();
}
