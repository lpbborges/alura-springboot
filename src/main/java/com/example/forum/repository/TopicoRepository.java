package com.example.forum.repository;

import com.example.forum.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);

//    List<Topico> findByCurso_Nome(String nomeCurso); Para diferenciar de um campo e utilizar o relacionamento usa-se "_"

    @Query("SELECT t from Topico t WHERE t.curso.nome = :nomeCurso")
    List<Topico> searchByNomeCurso(@Param("nomeCurso") String nomeCurso);
}
