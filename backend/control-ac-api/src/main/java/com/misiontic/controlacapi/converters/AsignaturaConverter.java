package com.misiontic.controlacapi.converters;

import com.misiontic.controlacapi.entities.Asignatura;

import com.misiontic.controlacapi.dtos.AsignaturaDTO;


public class AsignaturaConverter extends AbstractConverter<Asignatura, AsignaturaDTO> {

	@Override
	public AsignaturaDTO fromEntity(Asignatura entity) {
		return AsignaturaDTO.builder()
				.idAsignatura(entity.getIdAsignatura())
				.descripcionAsignatura(entity.getDescripcionAsignatura())
				.build();
	}

	@Override
	public Asignatura fromDTO(AsignaturaDTO dto) {
		return Asignatura.builder()
				.idAsignatura(dto.getIdAsignatura())
				.descripcionAsignatura(dto.getDescripcionAsignatura())
				.build();
	}
}