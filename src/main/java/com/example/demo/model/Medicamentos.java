package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MEDICAMENTOS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicamentos;

    @Column
    private String nome;

    @Column
    private String dosagem;

    @Column
    private int quantidade;

    @Column
    private String viaDeAdm;

    @Column
    private String obs;

}
