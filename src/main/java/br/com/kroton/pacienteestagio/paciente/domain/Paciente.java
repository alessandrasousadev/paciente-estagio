package br.com.kroton.pacienteestagio.paciente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

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
	
	public Paciente(@CPF String cpf, @NotBlank String nomeCompleto, @NotNull LocalDate dataNascimento,
			@NotBlank String celular, String endereco, Sexo sexo, @NotNull Boolean aceitaTermos) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.endereco = endereco;
		this.sexo = sexo;
		this.aceitaTermos = aceitaTermos;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
