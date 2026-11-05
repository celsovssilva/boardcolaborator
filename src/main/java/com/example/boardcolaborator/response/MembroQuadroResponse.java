package com.example.boardcolaborator.response;

import com.example.boardcolaborator.entity.MembroQuadro;
import com.example.boardcolaborator.entity.Role;

public record MembroQuadroResponse(
        Long id,
        Long userId,
        Long quadroId,
        Role role
) {
    public MembroQuadroResponse(MembroQuadro membroQuadro){
        this(
                membroQuadro.getId(),
                membroQuadro.getUser().getId(),
                membroQuadro.getQuadro().getId(),
                membroQuadro.getRole()
        );
    }
}
