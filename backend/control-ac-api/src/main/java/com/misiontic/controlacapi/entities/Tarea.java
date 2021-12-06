package com.misiontic.controlacapi.entities;

import java.time.LocalDate;
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
@Table(name = "tareas")
public class Tarea {

	@Id
	@Column(name = "idtarea")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTarea;

	@Column(name = "estado", length = 20, nullable = false)
	private String estado;	
	
	@Column(name = "fechalimite", nullable = false)
	private LocalDate fechaLimite;

	@Column(name = "calificacion", nullable = false)
	private Float calificacion;
	
	@Column(name = "observaciones", length = 400, nullable = false)
	private String observaciones;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "iddocente", nullable = false, updatable = true, referencedColumnName = "idusuario")
	private Usuario idDocente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idalumno", nullable = false, updatable = true, referencedColumnName = "idusuario")
	private Usuario idAlumno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "asignaturas_idasignatura", nullable = false, updatable = true, referencedColumnName = "idasignatura")	
	private Asignatura idAsignatura;	

}
