package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.service.ProntuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProntuarioController implements ProntuarioAPI {
	private final ProntuarioService prontuarioService;
	
	@Override
	public ProntuarioResponse postProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		log.info("[inicia] ProntuarioController - postProntuario");
		log.info("[idPaciente] {}", idPaciente);
		ProntuarioResponse prontuario = prontuarioService.criaProntuario(idPaciente, prontuarioRequest);
		log.info("[finaliza] ProntuarioController - postProntuario");
		return prontuario;
	}

}
