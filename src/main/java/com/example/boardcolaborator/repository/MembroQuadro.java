package com.example.boardcolaborator.repository;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroQuadro extends JpaRepository<MembroQuadro,Long> {
}
