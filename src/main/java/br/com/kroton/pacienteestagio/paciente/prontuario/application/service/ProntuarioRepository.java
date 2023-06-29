package br.com.kroton.pacienteestagio.paciente.prontuario.application.service;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;

public interface ProntuarioRepository {
	Prontuario salvaProntuario(Prontuario prontuario);
}
