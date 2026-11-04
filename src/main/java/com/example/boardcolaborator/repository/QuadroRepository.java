package com.example.boardcolaborator.repository;

import com.example.boardcolaborator.entity.Quadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadroRepository extends JpaRepository<Quadro,Long> {
}
