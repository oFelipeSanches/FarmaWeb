package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FARMACIA")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idFarmacia;

    @Column
    private String nome;

    @Column
    private String descricao;
}
