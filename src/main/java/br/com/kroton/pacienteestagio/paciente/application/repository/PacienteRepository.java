package br.com.kroton.pacienteestagio.paciente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;

public interface PacienteRepository {
	Paciente salva(Paciente paciente);
	List<Paciente> buscaTodosPacientes();
	Paciente buscaPacienteAtravesId(UUID idPaciente);
	void deletaPaciente(Paciente paciente);
}
