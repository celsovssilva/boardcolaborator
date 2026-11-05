package com.example.boardcolaborator.response;

import com.example.boardcolaborator.entity.Coluna;
import com.example.boardcolaborator.request.CartaoRequest;

import java.util.List;

public record ColunaResponse(
        Long id,
        String nome,
        Double posicao,
        Long quadroId,
        List<CartaoResponse>cartao
) {
    public ColunaResponse(Coluna coluna){
        this(
        coluna.getId(),
        coluna.getNome(),
        coluna.getPosicao(),
        coluna.getQuadro().getId(),
        coluna.getCartao().stream().map(CartaoResponse::new).toList()
        );
    }
}
