package com.example.boardcolaborator.response;

import com.example.boardcolaborator.entity.Cartao;

import java.util.List;

public record CartaoResponse(
        Long id,
        String titulo,
        String descricao,
        Long colunaId,
        Double posicao
) {
    public CartaoResponse(Cartao cartao){
        this(
                cartao.getId(),
                cartao.getTitulo(),
                cartao.getDescricao(),
                cartao.getColuna().getId(),
                cartao.getPosicao()
        );
    }

}
