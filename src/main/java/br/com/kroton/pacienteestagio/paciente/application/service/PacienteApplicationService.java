package br.com.kroton.pacienteestagio.paciente.application.service;

import org.springframework.stereotype.Service;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PacienteApplicationService implements PacienteService {

	@Override
	public PacienteResponse criaPaciente(PacienteRequest pacienteRequest) {
		log.info("[inicia] PacienteApplicationService - criaPaciente");
		log.info("[finaliza] PacienteApplicationService - criaPaciente");
		return null;
	}

}
