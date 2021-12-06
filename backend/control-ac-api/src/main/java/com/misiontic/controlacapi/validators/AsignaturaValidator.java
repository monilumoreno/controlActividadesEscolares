package com.misiontic.controlacapi.validators;

import com.misiontic.controlacapi.entities.Asignatura;
import com.misiontic.controlacapi.exceptions.ValidateServiceException;

public class AsignaturaValidator {
	
	public static void validador(Asignatura asignatura) {
		
		if (asignatura.getIdAsignatura() == null) {
			throw new ValidateServiceException("El Id de la asignatura es obligatorio");
		}
		
		if (asignatura.getDescripcionAsignatura() == null 
				|| asignatura.getDescripcionAsignatura().trim().isEmpty()) {
			throw new ValidateServiceException("La descripción de la asignatura es obligatoria");
		}
		
		if (asignatura.getDescripcionAsignatura().length() > 100) {
			throw new ValidateServiceException("La descripción de la asignatura debe tener máximo 100 caracteres.");
		}
	}
}