package com.myapp.myApp.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        Integer idade,

        @NotBlank
        Genero genero,

        @NotBlank
        String vagaPretendida,

        @NotBlank
        Float salarioDesejado

) {
}
