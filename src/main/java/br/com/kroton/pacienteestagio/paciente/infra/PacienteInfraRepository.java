package br.com.kroton.pacienteestagio.paciente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.kroton.pacienteestagio.paciente.application.repository.PacienteRepository;
import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PacienteInfraRepository implements PacienteRepository {
	private final PacienteSpringDataJPARepository pacienteSpringDataJPARepository;
	@Override
	public Paciente salva(Paciente paciente) {
		log.info("[inicia] PacienteInfraRepository - salva");
		pacienteSpringDataJPARepository.save(paciente);
		log.info("[finaliza] PacienteInfraRepository - salva");
		return paciente;
	}
	@Override
	public List<Paciente> buscaTodosPacientes() {
		log.info("[inicia] PacienteInfraRepository - buscaTodosPacientes");
		List<Paciente> todosPacientes = pacienteSpringDataJPARepository.findAll();
		log.info("[finaliza] PacienteInfraRepository - buscaTodosPacientes");
		return todosPacientes;
	}

}
