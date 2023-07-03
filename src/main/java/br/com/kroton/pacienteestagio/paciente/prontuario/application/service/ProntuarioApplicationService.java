package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.kroton.pacienteestagio.paciente.application.service.PacienteService;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioPacienteListResponse;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioRequest;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioResponse;
import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProntuarioApplicationService implements ProntuarioService {
	private final PacienteService pacienteService;
	private final ProntuarioRepository prontuarioRepository;
	
	@Override
	public ProntuarioResponse criaProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		log.info("[inicia] ProntuarioApplicationService - criaProntuario");
		pacienteService.buscaPacienteAtravesId(idPaciente);
		Prontuario prontuario = prontuarioRepository.salvaProntuario(new Prontuario(idPaciente, prontuarioRequest));
		log.info("[finaliza] ProntuarioApplicationService - criaProntuario");
		return new ProntuarioResponse(prontuario.getIdProntuario());
	}

	@Override
	public List<ProntuarioPacienteListResponse> buscaTodosProntuariosDoPacienteComId(UUID idPaciente) {
		log.info("[inicia] ProntuarioApplicationService - buscaTodosProntuariosDoPacienteComId");
		pacienteService.buscaPacienteAtravesId(idPaciente);
		log.info("[finaliza] ProntuarioApplicationService - buscaTodosProntuariosDoPacienteComId");
		return null;
	}

}
