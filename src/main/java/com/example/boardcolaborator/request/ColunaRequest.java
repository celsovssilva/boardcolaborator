package com.example.boardcolaborator.request;



public record ColunaRequest(
         Long id,
         String nome,
        Double posicao,
        Long quadroId,
         Long cartaoId
){
}
