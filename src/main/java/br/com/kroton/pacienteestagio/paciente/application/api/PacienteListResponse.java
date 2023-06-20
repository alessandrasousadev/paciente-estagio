package br.com.kroton.pacienteestagio.paciente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import br.com.kroton.pacienteestagio.paciente.domain.Sexo;

public class PacienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String dataNascimento;
	private String celular;
	private Sexo sexo;
	
	public static List<PacienteListResponse> converte(List<Paciente> pacientes) {
		return null;
	}
	
}
