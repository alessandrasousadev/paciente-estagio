package br.com.kroton.pacienteestagio.paciente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PacienteController implements PacienteAPI {

	@Override
	public PacienteResponse postPaciente(PacienteRequest pacienteRequest) {
		log.info("[inicia] PacienteController - postPaciente");
		log.info("[finaliza] PacienteController - postPaciente");
		return null;
	}

}
