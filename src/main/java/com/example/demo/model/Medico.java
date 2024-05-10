package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MEDICO")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;

    @Column
    private String nome;

    @Column
    private Double CRM;

    @Column
    private String especialidade;

    @Column
    private boolean autenticacao;

}
