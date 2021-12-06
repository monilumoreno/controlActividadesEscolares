package com.misiontic.controlacapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.controlacapi.entities.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
