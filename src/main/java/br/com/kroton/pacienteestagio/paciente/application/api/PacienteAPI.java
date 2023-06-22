package br.com.kroton.pacienteestagio.paciente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/paciente")
public interface PacienteAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PacienteResponse postPaciente(@Valid @RequestBody PacienteRequest pacienteRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PacienteListResponse> getTodosPacientes();
	
	@GetMapping(value = "/{idPaciente}")
	@ResponseStatus(code = HttpStatus.OK)
	PacienteDetalhadoResponse getPacienteAtravesId(@PathVariable UUID idPaciente);
	
	@DeleteMapping(value = "/{idPaciente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void  deletaPacienteAtravesId(@PathVariable UUID idPaciente);
}
