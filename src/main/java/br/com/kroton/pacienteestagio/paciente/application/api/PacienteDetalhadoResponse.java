package br.com.kroton.pacienteestagio.paciente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import br.com.kroton.pacienteestagio.paciente.domain.Sexo;
import lombok.Value;

@Value
public class PacienteDetalhadoResponse {
	private UUID idPaciente;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataNascimento;
	private String celular;
	private String endereco;
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private boolean aceitaTermos;
	
	public PacienteDetalhadoResponse(Paciente paciente) {
		this.idPaciente = paciente.getIdPaciente();
		this.nomeCompleto = paciente.getNomeCompleto();
		this.cpf = paciente.getCpf();
		this.dataNascimento = paciente.getDataNascimento();
		this.celular = paciente.getCelular();
		this.endereco = paciente.getEndereco();
		this.sexo = paciente.getSexo();
		this.dataHoraDoCadastro = paciente.getDataHoraDoCadastro();
		this.aceitaTermos = paciente.getAceitaTermos();
	}
}
