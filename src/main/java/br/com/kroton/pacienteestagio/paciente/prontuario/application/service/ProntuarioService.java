package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioPacienteDetalhadoResponse;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioPacienteListResponse;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioRequest;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioResponse;
import jakarta.validation.Valid;

public interface ProntuarioService {
	ProntuarioResponse criaProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest);
	List<ProntuarioPacienteListResponse> buscaTodosProntuariosDoPacienteComId(UUID idPaciente);
	ProntuarioPacienteDetalhadoResponse buscaProntuarioDoPaciente(UUID idPaciente, UUID idProntuario);
	void deletaProntuarioDoPacienteComId(UUID idPaciente, UUID idProntuario);
}
