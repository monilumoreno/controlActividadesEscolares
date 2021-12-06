package com.misiontic.controlacapi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.misiontic.controlacapi.converters.AsignaturaConverter;
import com.misiontic.controlacapi.dtos.AsignaturaDTO;
import com.misiontic.controlacapi.entities.Asignatura;
import com.misiontic.controlacapi.services.AsignaturaService;
import com.misiontic.controlacapi.utilities.WrapperResponse;

@RestController
public class AsignaturaController {

	@Autowired
	private AsignaturaService asignaturaService;
	private AsignaturaConverter converter = new AsignaturaConverter();
	
	@GetMapping(value = "/asignaturas/{asignaturaId}")
	public ResponseEntity<WrapperResponse<AsignaturaDTO>> findById(@PathVariable("asignaturaId") Long asignaturaId) {
		Asignatura asignatura = asignaturaService.findById(asignaturaId);
		AsignaturaDTO asignaturaDTO = converter.fromEntity(asignatura);
		return new WrapperResponse<>(true, "Success", asignaturaDTO).createResponse(HttpStatus.OK);
	}

	@DeleteMapping(value = "/asignaturas/{asignaturaId}")
	public ResponseEntity<?> delete(@PathVariable("asignaturaId") Long asignaturaId) {
		asignaturaService.delete(asignaturaId);
		return new WrapperResponse<>(true, "Success", null).createResponse(HttpStatus.OK);
	}

	@GetMapping(value = "/asignaturas")
	public ResponseEntity<WrapperResponse<List<AsignaturaDTO>>> findAll() {
		List<Asignatura> arregloAsignaturas = asignaturaService.findAll();
		List<AsignaturaDTO> asignaturasDTO = converter.fromEntity(arregloAsignaturas);
		return new WrapperResponse<>(true, "Success", asignaturasDTO).createResponse(HttpStatus.OK);
	}

	@PostMapping(value = "/asignaturas")
	public ResponseEntity<WrapperResponse<AsignaturaDTO>> create(@RequestBody AsignaturaDTO asignatura) {
		Asignatura nuevaAsignatura = asignaturaService.create(converter.fromDTO(asignatura));
		AsignaturaDTO asignaturaDTO = converter.fromEntity(nuevaAsignatura);
		return new WrapperResponse<>(true, "Success", asignaturaDTO).createResponse(HttpStatus.CREATED);
	}

	@PutMapping(value = "/asignaturas")
	public ResponseEntity<WrapperResponse<AsignaturaDTO>> update(@RequestBody AsignaturaDTO asignatura) {
		Asignatura existeAsignatura = asignaturaService.update(converter.fromDTO(asignatura));
		AsignaturaDTO asignaturaDTO = converter.fromEntity(existeAsignatura);
		return new WrapperResponse<>(true, "Success", asignaturaDTO).createResponse(HttpStatus.OK);
	}
}
