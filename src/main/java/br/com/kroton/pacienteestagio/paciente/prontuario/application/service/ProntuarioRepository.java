package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;

public interface ProntuarioRepository {
	Prontuario salvaProntuario(Prontuario prontuario);
	List<Prontuario> buscaTodosProntuariosDoPacienteComId(UUID idPaciente);
}
