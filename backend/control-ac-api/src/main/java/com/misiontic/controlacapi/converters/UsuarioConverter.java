package com.misiontic.controlacapi.converters;

import com.misiontic.controlacapi.dtos.UsuarioDTO;
import com.misiontic.controlacapi.entities.Usuario;

public class UsuarioConverter extends AbstractConverter<Usuario, UsuarioDTO> {
	
	@Override
	public UsuarioDTO fromEntity(Usuario entity) {
		return UsuarioDTO.builder()
				.idUsuario(entity.getIdUsuario())
				.numeroDocumento(entity.getNumeroDocumento())
				.tipoDocumento(entity.getTipoDocumento())
				.nombres(entity.getNombres())
				.apellidos(entity.getApellidos())
				.telefono(entity.getTelefono())
				.direccion(entity.getDireccion())
				.usuario(entity.getUsuario())
				.clave(entity.getClave())
				.idPerfil(entity.getIdPerfil())
				.idCurso(entity.getIdCurso())
				.idAcudiente(entity.getIdAcudiente())
				.build();
	}

	@Override
	public Usuario fromDTO(UsuarioDTO dto) {
		return Usuario.builder()
				.idUsuario(dto.getIdUsuario())
				.numeroDocumento(dto.getNumeroDocumento())
				.tipoDocumento(dto.getTipoDocumento())
				.nombres(dto.getNombres())
				.apellidos(dto.getApellidos())
				.telefono(dto.getTelefono())
				.direccion(dto.getDireccion())
				.usuario(dto.getUsuario())
				.clave(dto.getClave())
				.idPerfil(dto.getIdPerfil())
				.idCurso(dto.getIdCurso())
				.idAcudiente(dto.getIdAcudiente())
				.build();
	}
}