package br.com.kroton.pacienteestagio.paciente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/paciente")
public interface PacienteAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PacienteResponse postPaciente(@RequestBody PacienteRequest pacienteRequest);
}
