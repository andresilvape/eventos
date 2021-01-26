package com.eventos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventos.domain.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {

}
