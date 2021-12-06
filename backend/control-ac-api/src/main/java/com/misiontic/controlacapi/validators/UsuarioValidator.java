package com.misiontic.controlacapi.validators;

import com.misiontic.controlacapi.entities.Usuario;
import com.misiontic.controlacapi.exceptions.ValidateServiceException;

public class UsuarioValidator {
	
	public static void validador(Usuario usuario) {
		
		if (usuario.getNumeroDocumento() == null 
			|| usuario.getNumeroDocumento().trim().isEmpty()) {
			throw new ValidateServiceException("El número de documento es obligatorio");
		}
	
		if (usuario.getNumeroDocumento().length() > 15) {
			throw new ValidateServiceException("El número de documento debe ser de máximo 15 caracteres");
		}
		
		if (usuario.getTipoDocumento() == null 
				|| usuario.getTipoDocumento().isEmpty()) {
				throw new ValidateServiceException("El tipo de documento es obligatorio");
			}
		
		if (usuario.getTipoDocumento().length() > 30) {
			throw new ValidateServiceException("El tipo de documento debe ser de máximo 30 caracteres");
		}
		
		if (usuario.getNombres() == null 
				|| usuario.getNombres().isEmpty()) {
				throw new ValidateServiceException("El nombre es obligatorio");
			}
		
		if (usuario.getNombres().length() > 200) {
			throw new ValidateServiceException("El nombre debe ser de máximo 200 caracteres");
		}
		
		if (usuario.getApellidos() == null 
				|| usuario.getApellidos().isEmpty()) {
				throw new ValidateServiceException("El apellido es obligatorio");
			}
		
		if (usuario.getApellidos().length() > 200) {
			throw new ValidateServiceException("El apellido debe ser de máximo 200 caracteres");
		}
		
		if (usuario.getTelefono() == null 
				|| usuario.getTelefono().isEmpty()) {
				throw new ValidateServiceException("El número de teléfono es obligatorio");
			}
		
		if (usuario.getTelefono().length() > 30) {
			throw new ValidateServiceException("El número de teléfono debe ser de máximo 30 caracteres");
		}
		
		if (usuario.getDireccion() == null 
				|| usuario.getDireccion().isEmpty()) {
				throw new ValidateServiceException("La dirección es obligatoria");
			}
		
		if (usuario.getDireccion().length() > 100) {
			throw new ValidateServiceException("La dirección debe ser de máximo 100 caracteres");
		}
		
		if (usuario.getUsuario() == null 
				|| usuario.getUsuario().isEmpty()) {
				throw new ValidateServiceException("El nombre de usuario es obligatorio");
			}
		
		if (usuario.getUsuario().length() > 200) {
			throw new ValidateServiceException("El nombre de usuario debe ser de máximo 200 caracteres");
		}
		
		if (usuario.getClave() == null 
				|| usuario.getClave().isEmpty()) {
				throw new ValidateServiceException("La contraseña es obligatoria");
			}
		
		if (usuario.getClave().length() > 100) {
			throw new ValidateServiceException("La contraseña debe ser de máximo 200 caracteres");
		}
		
		if (usuario.getIdPerfil() == null) {
			throw new ValidateServiceException("El Id del perfil es obligatorio");
		}
	}
}