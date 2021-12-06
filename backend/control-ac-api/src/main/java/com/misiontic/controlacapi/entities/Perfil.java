package com.misiontic.controlacapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "perfiles")
public class Perfil {

	@Id
	@Column(name = "idperfil")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerfil;

	@Column(name = "descripcionperfil", length = 45, nullable = false)
	private String descripcionPerfil;
/*	
	@OneToMany(mappedBy = "idPerfil", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Usuario> listaUsuarios;
*/
}
