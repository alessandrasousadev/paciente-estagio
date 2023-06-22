package br.com.kroton.pacienteestagio.paciente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.kroton.pacienteestagio.handler.APIException;
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
	@Override
	public Paciente buscaPacienteAtravesId(UUID idPaciente) {
		log.info("[inicia] PacienteInfraRepository - buscaPacienteAtravesId");
		Paciente paciente = pacienteSpringDataJPARepository.findById(idPaciente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Paciente não encontrado!"));
		log.info("[finaliza] PacienteInfraRepository - buscaPacienteAtravesId");
		return paciente;
	}
	@Override
	public void deletaPaciente(Paciente paciente) {
		log.info("[inicia] PacienteInfraRepository - deletaPaciente");
		pacienteSpringDataJPARepository.delete(paciente);
		log.info("[finaliza] PacienteInfraRepository - deletaPaciente");
	}

}
