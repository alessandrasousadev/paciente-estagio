package br.com.kroton.pacienteestagio.paciente.application.api;

import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.domain.Sexo;

public class PacienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String dataNascimento;
	private String celular;
	private String endereco;
	private Sexo sexo;
	
}
