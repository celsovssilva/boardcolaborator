package com.example.boardcolaborator.repository;

import com.example.boardcolaborator.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository  extends JpaRepository<Cartao,Long> {
}
