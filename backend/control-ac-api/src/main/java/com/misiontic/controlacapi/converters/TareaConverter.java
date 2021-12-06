package com.misiontic.controlacapi.converters;

import com.misiontic.controlacapi.dtos.TareaDTO;
import com.misiontic.controlacapi.entities.Tarea;

public class TareaConverter extends AbstractConverter<Tarea, TareaDTO> {
	
	@Override
	public TareaDTO fromEntity(Tarea entity) {
		return TareaDTO.builder()
				.idTarea(entity.getIdTarea())
				.estado(entity.getEstado())
				.fechaLimite(entity.getFechaLimite())
				.calificacion(entity.getCalificacion())
				.observaciones(entity.getObservaciones())
				.idDocente(entity.getIdDocente())
				.idAlumno(entity.getIdAlumno())
				.idAsignatura(entity.getIdAsignatura())
				.build();
	}

	@Override
	public Tarea fromDTO(TareaDTO dto) {
		return Tarea.builder()
				.idTarea(dto.getIdTarea())
				.estado(dto.getEstado())
				.fechaLimite(dto.getFechaLimite())
				.calificacion(dto.getCalificacion())
				.observaciones(dto.getObservaciones())
				.idDocente(dto.getIdDocente())
				.idAlumno(dto.getIdAlumno())
				.idAsignatura(dto.getIdAsignatura())
				.build();
	}
}