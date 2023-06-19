package br.com.kroton.pacienteestagio.paciente.application.service;

import org.springframework.stereotype.Service;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteResponse;
import br.com.kroton.pacienteestagio.paciente.application.repository.PacienteRepository;
import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PacienteApplicationService implements PacienteService {
	private final PacienteRepository pacienteRepository;
	
	@Override
	public PacienteResponse criaPaciente(PacienteRequest pacienteRequest) {
		log.info("[inicia] PacienteApplicationService - criaPaciente");
		Paciente paciente = pacienteRepository.salva(new Paciente(pacienteRequest));
		log.info("[finaliza] PacienteApplicationService - criaPaciente");
		return PacienteResponse.builder()
				.idPaciente(paciente.getIdPaciente())
				.build();
	}

}
