package com.example.boardcolaborator.response;

import com.example.boardcolaborator.entity.Quadro;

import java.util.List;

public record QuadroResponse(
        Long id,
        String titulo,
        String descricao,
        List<ColunaResponse> colunaResponseList
) {
    public QuadroResponse(Quadro quadro){
        this(
                quadro.getId(),
                quadro.getTitulo(),
                quadro.getDescricao(),
                quadro.getColuna().stream().map(ColunaResponse::new).toList()
        );
    }
}
