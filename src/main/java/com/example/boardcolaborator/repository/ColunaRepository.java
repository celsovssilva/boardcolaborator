package com.example.boardcolaborator.repository;

import com.example.boardcolaborator.entity.Coluna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColunaRepository  extends JpaRepository<Coluna,Long> {
}
