package com.myapp.myApp.domain.usuario;

public record DadosDetalhamentoUsuario(Long id, String nome, String email, Integer idade, Genero genero, String vagaPretendida, Float salarioDesejado) {

    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getIdade(), usuario.getGenero(), usuario.getVagaPretendida(), usuario.getSalarioDesejado());
    }

}
