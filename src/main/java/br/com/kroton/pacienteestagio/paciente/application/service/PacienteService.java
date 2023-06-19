package br.com.kroton.pacienteestagio.paciente.application.service;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import br.com.kroton.pacienteestagio.paciente.application.api.PacienteResponse;

public interface PacienteService {
	PacienteResponse criaPaciente(PacienteRequest pacienteRequest);

}
