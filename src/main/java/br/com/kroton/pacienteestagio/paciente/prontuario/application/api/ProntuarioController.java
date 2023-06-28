package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ProntuarioController implements ProntuarioAPI {

	@Override
	public ProntuarioResponse postProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		log.info("[inicia] ProntuarioController - postProntuario");
		log.info("[idPaciente] {}", idPaciente);
		log.info("[finaliza] ProntuarioController - postProntuario");
		return null;
	}

}
