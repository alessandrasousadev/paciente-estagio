package br.com.kroton.pacienteestagio.paciente.application.repository;

import java.util.List;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;

public interface PacienteRepository {
	Paciente salva(Paciente paciente);
	List<Paciente> buscaTodosPacientes();
}
