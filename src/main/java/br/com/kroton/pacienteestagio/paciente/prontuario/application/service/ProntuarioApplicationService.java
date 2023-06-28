package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioRequest;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProntuarioApplicationService implements ProntuarioService {

	@Override
	public ProntuarioResponse criaProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		log.info("[inicia] ProntuarioApplicationService - criaProntuario");
		log.info("[finaliza] ProntuarioApplicationService - criaProntuario");
		return null;
	}

}
