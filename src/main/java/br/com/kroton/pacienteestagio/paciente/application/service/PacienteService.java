package br.com.kroton.pacienteestagio.paciente.application.service;

import java.util.List;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteListResponse;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteResponse;

public interface PacienteService {
	PacienteResponse criaPaciente(PacienteRequest pacienteRequest);
	List<PacienteListResponse> buscaTodosPacientes();

}
