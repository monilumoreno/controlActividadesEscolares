package com.misiontic.controlacapi.dtos;


import com.misiontic.controlacapi.entities.Curso;
import com.misiontic.controlacapi.entities.Perfil;
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
public class UsuarioDTO {

	private Long idUsuario;
	private String numeroDocumento;
	private String tipoDocumento;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String usuario;
	private String clave;
	private Perfil idPerfil;
	private Curso idCurso;
	private Usuario idAcudiente;
}
