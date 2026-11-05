package com.example.boardcolaborator.request;

import com.example.boardcolaborator.entity.Coluna;


public record CartaoRequest(
         Long id,
        String titulo,
        String descricao,
        Long colunaId,

        Double posicao
) {
}
