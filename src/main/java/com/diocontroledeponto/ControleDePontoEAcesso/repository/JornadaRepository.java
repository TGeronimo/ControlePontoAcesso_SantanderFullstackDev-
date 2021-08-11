package com.diocontroledeponto.ControleDePontoEAcesso.repository;

import com.diocontroledeponto.ControleDePontoEAcesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
