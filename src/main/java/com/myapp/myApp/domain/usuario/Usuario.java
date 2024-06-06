package com.myapp.myApp.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuario")
@Table(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String vagaPretendida;
    private Float salarioDesejado;


    public Usuario(DadosCadastroUsuario dados) {

        this.nome = dados.nome();
        this.email = dados.email();
        this.idade = dados.idade();
        this.genero = dados.genero();
        this.vagaPretendida = dados.vagaPretendida();
        this.salarioDesejado = dados.salarioDesejado();

    }
}
