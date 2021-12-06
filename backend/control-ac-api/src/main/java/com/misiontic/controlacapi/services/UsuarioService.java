package com.misiontic.controlacapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.controlacapi.entities.Usuario;
import com.misiontic.controlacapi.exceptions.GeneralServiceException;
import com.misiontic.controlacapi.exceptions.NoDataFoundException;
import com.misiontic.controlacapi.exceptions.ValidateServiceException;
import com.misiontic.controlacapi.repositories.UsuarioRepository;
import com.misiontic.controlacapi.validators.UsuarioValidator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	public Usuario findById(Long idUsuario) {

		try {
			Usuario usuario = usuarioRepo.findById(idUsuario)
					.orElseThrow(() -> new NoDataFoundException("Usuario no registrado"));
			return usuario;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public void delete(Long idUsuario) {
		try {
			Usuario usuario = usuarioRepo.findById(idUsuario)
					.orElseThrow(() -> new NoDataFoundException("Usuario no registrado"));
			usuarioRepo.delete(usuario);
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public List<Usuario> findAll() {
		try {
			List<Usuario> arregloUsuarios = usuarioRepo.findAll();
			return arregloUsuarios;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public Usuario create(Usuario usuario) {
		try {
			UsuarioValidator.validador(usuario);
			Usuario nuevoUsuario = usuarioRepo.save(usuario);
			return nuevoUsuario;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public Usuario update(Usuario usuario) {
		try {
			UsuarioValidator.validador(usuario);
			Usuario existeUsuario = usuarioRepo.findById(usuario.getIdUsuario())
					.orElseThrow(() -> new NoDataFoundException("Usuario no registrado"));
			
			existeUsuario.setNumeroDocumento(usuario.getNumeroDocumento());
			existeUsuario.setTipoDocumento(usuario.getTipoDocumento());
			existeUsuario.setNombres(usuario.getNombres());
			existeUsuario.setApellidos(usuario.getApellidos());
			existeUsuario.setTelefono(usuario.getTelefono());
			existeUsuario.setDireccion(usuario.getDireccion());
			existeUsuario.setUsuario(usuario.getUsuario());
			existeUsuario.setClave(usuario.getClave());
			existeUsuario.setIdPerfil(usuario.getIdPerfil());
			existeUsuario.setIdCurso(usuario.getIdCurso());
			existeUsuario.setIdAcudiente(usuario.getIdAcudiente());
			usuarioRepo.save(existeUsuario);
			return existeUsuario;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}
}