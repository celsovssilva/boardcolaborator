package com.example.boardcolaborator.request;


public record QuadroRequest(
         Long id,
        String titulo,
         String descricao,
        Long colunaId
) {
}
