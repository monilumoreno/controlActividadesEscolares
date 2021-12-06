package com.misiontic.controlacapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misiontic.controlacapi.dtos.TareaParamsDTO;
import com.misiontic.controlacapi.entities.Tarea;
import com.misiontic.controlacapi.entities.Usuario;
import com.misiontic.controlacapi.exceptions.GeneralServiceException;
import com.misiontic.controlacapi.exceptions.NoDataFoundException;
import com.misiontic.controlacapi.exceptions.ValidateServiceException;
import com.misiontic.controlacapi.repositories.TareaRepository;
import com.misiontic.controlacapi.repositories.UsuarioRepository;
import com.misiontic.controlacapi.validators.TareaValidator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TareaService {

	@Autowired
	private TareaRepository tareaRepo;
	private UsuarioRepository usuarioRepo;
	
	public Tarea findById(Long idTarea) {
	 
		try {
			Tarea tarea = tareaRepo.findById(idTarea)
					.orElseThrow(() -> new NoDataFoundException("Tarea no registrada"));
			return tarea;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public void delete(Long idTarea) {
		try {
			Tarea tarea = tareaRepo.findById(idTarea)
					.orElseThrow(() -> new NoDataFoundException("Tarea no registrada"));
			tareaRepo.delete(tarea);
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public List<Tarea> findAll() {
		try {
			List<Tarea> arregloTareas = tareaRepo.findAll();
			return arregloTareas;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public Tarea create(Tarea tarea) {
		try {
			TareaValidator.validador(tarea);
			Tarea nuevaTarea = tareaRepo.save(tarea);
			return nuevaTarea;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}
	
	public void createAll(TareaParamsDTO tareaParams) {
		try {
				List<Usuario> arregloUsuarios = usuarioRepo.findAll();

				for (Usuario usuario : arregloUsuarios) {
					if (usuario.getIdCurso() == tareaParams.getIdCurso()) {
					
						Tarea tarea = new Tarea();
						tarea.setEstado("Pendiente");
						tarea.setIdAsignatura(tareaParams.getIdAsignatura());
						tarea.setIdDocente(tareaParams.getIdDocente());
						tarea.setIdAlumno(usuario);
						TareaValidator.validador(tarea);
						//Tarea nuevaTarea = tareaRepo.save(tarea);
						tareaRepo.save(tarea);
				}
			}			
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}

	public Tarea update(Tarea tarea) {
		try {
			TareaValidator.validador(tarea);
			Tarea existeTarea = tareaRepo.findById(tarea.getIdTarea())
					.orElseThrow(() -> new NoDataFoundException("Tarea no registrada"));
			
			existeTarea.setEstado(tarea.getEstado());
			existeTarea.setFechaLimite(tarea.getFechaLimite());
			existeTarea.setCalificacion(tarea.getCalificacion());
			existeTarea.setObservaciones(tarea.getObservaciones());
			existeTarea.setIdDocente(tarea.getIdDocente());
			existeTarea.setIdAlumno(tarea.getIdAlumno());
			existeTarea.setIdAsignatura(tarea.getIdAsignatura());
			tareaRepo.save(existeTarea);
			return existeTarea;
		} catch (ValidateServiceException | NoDataFoundException e) {
			log.info(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new GeneralServiceException(e.getMessage(), e);
		}
	}
}