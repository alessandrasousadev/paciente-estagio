package br.com.kroton.pacienteestagio.paciente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pacienteestagio.paciente.application.service.PacienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PacienteController implements PacienteAPI {
	private final PacienteService pacienteService;

	@Override
	public PacienteResponse postPaciente(PacienteRequest pacienteRequest) {
		log.info("[inicia] PacienteController - postPaciente");
		PacienteResponse pacienteCriado = pacienteService.criaPaciente(pacienteRequest);
		log.info("[finaliza] PacienteController - postPaciente");
		return pacienteCriado;
	}

}
