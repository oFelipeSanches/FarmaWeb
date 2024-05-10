package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RECEITA")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReceita;

    @Column
    private String data_emissao;

    @Column
    private String Medico;

    @Column
    private String medicamentos;
}
