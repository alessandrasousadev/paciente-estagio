package br.com.kroton.pacienteestagio.paciente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import br.com.kroton.pacienteestagio.paciente.domain.Sexo;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PacienteAlteracaoRequest {
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
}
