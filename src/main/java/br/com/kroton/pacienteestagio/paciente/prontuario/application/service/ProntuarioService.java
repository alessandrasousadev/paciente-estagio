package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioRequest;
import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioResponse;
import jakarta.validation.Valid;

public interface ProntuarioService {
	ProntuarioResponse criaProntuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest);
}
