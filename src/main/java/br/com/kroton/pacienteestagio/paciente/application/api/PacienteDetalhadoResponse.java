package br.com.kroton.pacienteestagio.paciente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.domain.Sexo;
import lombok.Value;

@Value
public class PacienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataNascimento;
	private String celular;
	private String endereco;
	private Sexo sexo;
	private LocalDate dataHoraDoCadastro;
	private boolean aceitaTermos;
}
