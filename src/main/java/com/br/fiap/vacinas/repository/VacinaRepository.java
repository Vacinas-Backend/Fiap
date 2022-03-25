package com.br.fiap.vacinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.fiap.vacinas.model.Vacinas;

@Repository
public interface VacinaRepository extends JpaRepository<Vacinas, Long> {


}
