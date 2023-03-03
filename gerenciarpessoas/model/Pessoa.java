package br.com.gerenciarpessoas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pessoa implements Serializable {
    //fazer lista de pessoas e endereço
    private List <Pessoa> pessoas = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dataNascimento")
    private String dataNascimento;

    @Column(name = "endereco")
    private List <Enderecos> enderecos = new ArrayList<>();

   }