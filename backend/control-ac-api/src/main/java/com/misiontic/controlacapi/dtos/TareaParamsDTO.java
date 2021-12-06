package com.misiontic.controlacapi.dtos;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.misiontic.controlacapi.entities.Asignatura;
import com.misiontic.controlacapi.entities.Curso;
import com.misiontic.controlacapi.entities.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TareaParamsDTO {

	private Usuario idDocente;
	private Curso idCurso;
	private Asignatura idAsignatura;	
	
	@JsonFormat(pattern = "yyy-MM-dd")
	private LocalDate fechaLimite;
}