package br.com.kroton.pacienteestagio.paciente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteAlteracaoRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteDetalhadoResponse;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteListResponse;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteResponse;

public interface PacienteService {
	PacienteResponse criaPaciente(PacienteRequest pacienteRequest);
	List<PacienteListResponse> buscaTodosPacientes();
	PacienteDetalhadoResponse buscaPacienteAtravesId(UUID idPaciente);
	void deletaPacienteAtravesId(UUID idPaciente);
	void patchAlteraPaciente(UUID idPaciente, PacienteAlteracaoRequest pacienteAlteracaoRequest);
}
