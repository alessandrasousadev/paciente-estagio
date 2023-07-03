package br.com.kroton.pacienteestagio.paciente.prontuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.kroton.pacienteestagio.handler.APIException;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.service.ProntuarioRepository;
import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProntuarioInfraRepository implements ProntuarioRepository {
	private final ProntuarioSpringDataJPARepository prontuarioSpringDataJPARepository;
	@Override
	public Prontuario salvaProntuario(Prontuario prontuario) {
		log.info("[inicia] ProntuarioInfraRepository - salvaProntuario");
		prontuarioSpringDataJPARepository.save(prontuario);
		log.info("[finaliza] ProntuarioInfraRepository - salvaProntuario");
		return prontuario;
	}
	@Override
	public List<Prontuario> buscaTodosProntuariosDoPacienteComId(UUID idPaciente) {
		log.info("[inicia] ProntuarioInfraRepository - buscaTodosProntuariosDoPacienteComId");
		var prontuarios = prontuarioSpringDataJPARepository.findByIdPacienteTitular(idPaciente);
		log.info("[finaliza] ProntuarioInfraRepository - buscaTodosProntuariosDoPacienteComId");
		return prontuarios;
	}
	@Override
	public Prontuario buscaProntuarioPeloId(UUID idProntuario) {
		log.info("[inicia] ProntuarioInfraRepository - buscaProntuarioPeloId");
		var prontuario = prontuarioSpringDataJPARepository.findById(idProntuario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Prontuario não encontrado para o idProntuario =" + idProntuario));
		log.info("[finaliza] ProntuarioInfraRepository - buscaProntuarioPeloId");
		return prontuario;
	}
}
