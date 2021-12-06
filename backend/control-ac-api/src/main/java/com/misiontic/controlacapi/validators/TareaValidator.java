package com.misiontic.controlacapi.validators;

import java.time.LocalDate;
import com.misiontic.controlacapi.entities.Tarea;
import com.misiontic.controlacapi.exceptions.ValidateServiceException;

public class TareaValidator {
	
	public static void validador(Tarea tarea) {
	
		if (tarea.getEstado() == null 
			|| tarea.getEstado().trim().isEmpty()) {
				throw new ValidateServiceException("El estado es obligatorio");
		}
	
		if (tarea.getEstado().length() > 20) {
			throw new ValidateServiceException("El estado debe ser de máximo 20 caracteres");
		}
		
		if (tarea.getFechaLimite() == null) {
			throw new ValidateServiceException("La fecha límite es obligatoria");			
		}
		
		if (tarea.getFechaLimite().isBefore(LocalDate.now())) {
			throw new ValidateServiceException("La fecha límite debe ser mayor o igual a la fecha actual");
		}
		
		if (tarea.getCalificacion() < 0 || tarea.getCalificacion() > 5) {
			throw new ValidateServiceException("La calificación debe estar entre 0 y 5");
		}
		
		if (tarea.getObservaciones() == null 
				|| tarea.getObservaciones().isEmpty()) {
				throw new ValidateServiceException("La observación es obligatoria");
		}
		
		if (tarea.getObservaciones().length() > 400) {
				throw new ValidateServiceException("La observación debe ser de máximo 400 caracteres");
		}
		
		if (tarea.getIdAlumno() == null) {
			throw new ValidateServiceException("El Id del alumno es obligatorio");
		}
		
		if (tarea.getIdDocente() == null) {
			throw new ValidateServiceException("El Id del docente es obligatorio");
		}
		
		if (tarea.getIdAsignatura() == null) {
			throw new ValidateServiceException("El Id de la asignatura es obligatorio");
		}
	}
}