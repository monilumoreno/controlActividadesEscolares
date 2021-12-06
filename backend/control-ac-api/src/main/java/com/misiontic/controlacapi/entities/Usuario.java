package com.misiontic.controlacapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario", nullable = false)
	private Long idUsuario;
	
	@Column(name = "numerodocumento", length = 15, nullable = false)
	private String numeroDocumento;
	
	@Column(name = "tipodocumento", length = 30, nullable = false)
	private String tipoDocumento;
	
	@Column(name = "nombres", length = 200, nullable = false)
	private String nombres;

	@Column(name = "apellidos", length = 200, nullable = false)
	private String apellidos;
	
	@Column(name = "telefono", length = 30, nullable = false)
	private String telefono;
	
	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;
	
	@Column(name = "usuario", length = 200, nullable = true)
	private String usuario;

	@Column(name = "clave", length = 100, nullable = true)
	private String clave;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "perfiles_idperfil", nullable = false, updatable = true, referencedColumnName = "idperfil")
	private Perfil idPerfil;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cursos_idcurso", nullable = true, updatable = true, referencedColumnName = "idcurso")
	private Curso idCurso;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idacudiente", nullable = true, updatable = true, referencedColumnName = "idusuario")
	private Usuario idAcudiente;
/*	
	@OneToMany(mappedBy = "idDocente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Tarea> listadoTareasDocente;
	
	@OneToMany(mappedBy = "idAlumno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Tarea> listadoTareasAlumno;
*/	
}
