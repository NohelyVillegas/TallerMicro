package com.espe.micro_cursos.repositories;

import com.espe.micro_cursos.models.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository  extends CrudRepository<Curso, Long> {

}
