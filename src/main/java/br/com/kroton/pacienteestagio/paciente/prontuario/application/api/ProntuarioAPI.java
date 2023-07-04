package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteAlteracaoRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteDetalhadoResponse;
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
	
	@GetMapping(value = "/{idProntuario}")
	@ResponseStatus(code = HttpStatus.OK)
	ProntuarioPacienteDetalhadoResponse getProntuarioPaciente(@PathVariable UUID idPaciente, @PathVariable UUID idProntuario);
	
	@DeleteMapping(value = "/{idProntuario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void  deletaProntuarioAtravesId(@PathVariable UUID idPaciente, @PathVariable UUID idProntuario);
	
	@PatchMapping(value = "/{idProntuario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	ProntuarioResponse patchProntuario(@PathVariable UUID idPaciente, @PathVariable UUID idProntuario, 
			@Valid @RequestBody ProntuarioAlteracaoRequest prontuarioAlteracaoRequest);
	
}
