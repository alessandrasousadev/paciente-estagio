package br.com.kroton.pacienteestagio.paciente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteDetalhadoResponse;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteListResponse;
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

	@Override
	public List<PacienteListResponse> buscaTodosPacientes() {
		log.info("[inicia] PacienteApplicationService - buscaTodosPacientes");	
		List<Paciente> pacientes = pacienteRepository.buscaTodosPacientes();	
		log.info("[finaliza] PacienteApplicationService - buscaTodosPacientes");
		return PacienteListResponse.converte(pacientes);
	}

	@Override
	public PacienteDetalhadoResponse buscaPacienteAtravesId(UUID idPaciente) {
		log.info("[inicia] PacienteApplicationService - buscaPacienteAtravesId");	
		log.info("[finaliza] PacienteApplicationService - buscaPacienteAtravesId");	
		return null;
	}

}
