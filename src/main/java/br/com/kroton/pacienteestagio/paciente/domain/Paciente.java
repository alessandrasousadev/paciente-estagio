package br.com.kroton.pacienteestagio.paciente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import br.com.kroton.pacienteestagio.paciente.application.api.PacienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPaciente;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	private String endereco;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	

	public Paciente(PacienteRequest pacienteRequest) {
		this.nomeCompleto = pacienteRequest.getNomeCompleto();
		this.cpf = pacienteRequest.getCpf();
		this.dataNascimento = pacienteRequest.getDataNascimento();
		this.celular = pacienteRequest.getCelular();
		this.endereco = pacienteRequest.getEndereco();
		this.sexo = pacienteRequest.getSexo();
		this.aceitaTermos = pacienteRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
