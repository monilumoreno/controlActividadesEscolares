package com.misiontic.controlacapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.controlacapi.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
