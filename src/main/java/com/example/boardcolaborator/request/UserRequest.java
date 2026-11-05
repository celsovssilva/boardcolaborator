package com.example.boardcolaborator.request;

public record UserRequest(
        Long id ,
        String nome,
        String email,
         String senha
) {
}
