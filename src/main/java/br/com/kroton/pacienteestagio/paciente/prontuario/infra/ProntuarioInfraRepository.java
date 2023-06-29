package br.com.kroton.pacienteestagio.paciente.prontuario.infra;

import org.springframework.stereotype.Repository;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.service.ProntuarioRepository;
import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ProntuarioInfraRepository implements ProntuarioRepository {

	@Override
	public Prontuario salvaProntuario(Prontuario prontuario) {
		log.info("[inicia] ProntuarioInfraRepository - salvaProntuario");
		log.info("[finaliza] ProntuarioInfraRepository - salvaProntuario");
		return null;
	}

}
