package br.com.kroton.pacienteestagio.paciente.application.repository;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;

public interface PacienteRepository {
	Paciente salva(Paciente paciente);
}
