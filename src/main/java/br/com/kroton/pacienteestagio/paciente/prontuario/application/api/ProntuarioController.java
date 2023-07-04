package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteListResponse;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.service.ProntuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProntuarioController implements ProntuarioAPI {
	private final ProntuarioService prontuarioService;
	
	@Override
	public ProntuarioResponse postProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		log.info("[inicia] ProntuarioController - postProntuario");
		log.info("[idPaciente] {}", idPaciente);
		ProntuarioResponse prontuario = prontuarioService.criaProntuario(idPaciente, prontuarioRequest);
		log.info("[finaliza] ProntuarioController - postProntuario");
		return prontuario;
	}

	@Override
	public List<ProntuarioPacienteListResponse> getProntuariosDoPacienteComId(UUID idPaciente) {
		log.info("[inicia] ProntuarioController - getProntuariosDoPacienteComId");
		log.info("[idPaciente] {}", idPaciente);
		List<ProntuarioPacienteListResponse> prontuariosDoPaciente = prontuarioService.buscaTodosProntuariosDoPacienteComId(idPaciente);
		log.info("[finaliza] ProntuarioController - getProntuariosDoPacienteComId");
		return prontuariosDoPaciente;
	}

	@Override
	public ProntuarioPacienteDetalhadoResponse getProntuarioPaciente(UUID idPaciente, UUID idProntuario) {
		log.info("[inicia] ProntuarioController - getProntuarioPaciente");
		log.info("[idPaciente] {} - [idProntuario] {}", idPaciente, idProntuario);
		ProntuarioPacienteDetalhadoResponse prontuario = prontuarioService.buscaProntuarioDoPaciente(idPaciente, idProntuario);
		log.info("[finaliza] ProntuarioController - getProntuarioPaciente");
		return prontuario;
	}

	@Override
	public void deletaProntuarioAtravesId(UUID idPaciente, UUID idProntuario) {
		log.info("[inicia] ProntuarioController - deletaProntuarioAtravesId");
		log.info("[idPaciente] {} - [idProntuario] {}", idPaciente, idProntuario);
		prontuarioService.deletaProntuarioDoPacienteComId(idPaciente, idProntuario);
		log.info("[finaliza] ProntuarioController - deletaProntuarioAtravesId");
		
	}

	@Override
	public void patchProntuario(UUID idPaciente, UUID idProntuario,
			@Valid ProntuarioAlteracaoRequest prontuarioAlteracaoRequest) {
		log.info("[inicia] ProntuarioController - patchProntuario");
		log.info("[idPaciente] {} - [idProntuario] {}", idPaciente, idProntuario);
		log.info("[finaliza] ProntuarioController - patchProntuario");
	}


}
