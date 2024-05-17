package com.example.demo.service.inter;

import com.example.demo.model.Medicamentos;

import java.util.List;

public interface IMedicamentosService {

    public void cadastrarMedicamentos(Medicamentos medicamentos);

    public void alterarMedicamentos(Medicamentos medicamentos);

    public void excluirMedicamentos(Long id);

    public List<Medicamentos> listarMedicamentos();

    public Medicamentos buscarPorId(Long id);
}
