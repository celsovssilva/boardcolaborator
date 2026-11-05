package com.example.boardcolaborator.request;

public record MoverCartaoRequest(
        Long cartaoId,
        Long colunaId,
        Double novaPosicao
) {
    public MoverCartaoRequest {
        if (cartaoId == null || colunaId== null || novaPosicao == null) {
            throw new IllegalArgumentException("CARTAO e COLUNA e POSIÇÃO são obrigatórios!");
        }
    }
}
