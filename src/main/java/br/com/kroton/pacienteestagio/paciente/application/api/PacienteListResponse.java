package br.com.kroton.pacienteestagio.paciente.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;
import br.com.kroton.pacienteestagio.paciente.domain.Sexo;
import lombok.Value;

@Value
public class PacienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
	
	public static List<PacienteListResponse> converte(List<Paciente> pacientes) {
		return pacientes.stream()
				.map(PacienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PacienteListResponse(Paciente paciente) {
		this.idCliente = paciente.getIdPaciente();
		this.nomeCompleto = paciente.getNomeCompleto();
		this.cpf = paciente.getCpf();
		this.dataNascimento = paciente.getDataNascimento();
		this.celular = paciente.getCelular();
		this.sexo = paciente.getSexo();
	}
}
