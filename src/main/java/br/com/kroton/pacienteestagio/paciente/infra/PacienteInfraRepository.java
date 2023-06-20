package br.com.kroton.pacienteestagio.paciente.infra;

import org.springframework.stereotype.Repository;

import br.com.kroton.pacienteestagio.paciente.application.repository.PacienteRepository;
import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class PacienteInfraRepository implements PacienteRepository {

	@Override
	public Paciente salva(Paciente paciente) {
		log.info("[inicia] PacienteInfraRepository - salva");
		log.info("[finaliza] PacienteInfraRepository - salva");
		return paciente;
	}

}
