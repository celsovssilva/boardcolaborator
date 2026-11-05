package com.example.boardcolaborator.request;

import com.example.boardcolaborator.entity.Quadro;
import com.example.boardcolaborator.entity.Role;

public record MembroQuadroRequest (
         Long id,

         Long userId,
        Long quadroId,
        Role role

){
}
