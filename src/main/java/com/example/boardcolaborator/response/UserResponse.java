package com.example.boardcolaborator.response;

import com.example.boardcolaborator.entity.User;

public record UserResponse(
        Long id ,
        String nome,
        String email
) {
    public UserResponse(User user){
        this(
                user.getId(),
                user.getNome(),
                user.getEmail()
        );
    }
}
