package br.com.kroton.pacienteestagio.paciente.prontuario.domain;

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
public class Protuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idProntuario", updatable = false, unique = true, nullable = false)
	private UUID idProntuario;
	@CPF
	@Column(unique = true)
	private String cpfPaciente;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private String objetivoDaConsulta;
	private AnamnesePaciente anamnesePaciente;
	@Enumerated(EnumType.STRING )
	private RitmoIntestinal ritmoIntestinal; 
	@NotNull
	private LocalDate dataDaConsulta;
	@NotNull
	private LocalDate dataDoRetorno;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
}
