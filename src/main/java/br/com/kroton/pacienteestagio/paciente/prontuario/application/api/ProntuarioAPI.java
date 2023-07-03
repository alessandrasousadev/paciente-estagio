package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteListResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/paciente/{idPaciente}/prontuario")
public interface ProntuarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ProntuarioResponse postProntuario(@PathVariable UUID idPaciente,
			@Valid @RequestBody ProntuarioRequest prontuarioRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ProntuarioPacienteListResponse> getProntuariosDoPacienteComId(@PathVariable UUID idPaciente);
	
}
