package com.misiontic.controlacapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.controlacapi.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
