package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.time.LocalDate;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.RitmoIntestinal;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProntuarioAlteracaoRequest {
	@NotBlank
	private String nomeCompletoPaciente;
	@NotNull
	private String objetivoDaConsulta;
	private RitmoIntestinal ritmoIntestinal; 
	@NotNull
	private Boolean alergiaAlimentar;
	@NotNull
	private Boolean usoDeMedicamento;
	@NotBlank
	private String qualMedicamento;
	@NotNull
	private Boolean intoleranciaLactose;
	@NotNull
	private Boolean alergiaProteinaDoLeite;
	@NotNull
	private Boolean gastrite;
	@NotNull
	private Boolean diabetes;
	@NotNull
	private Boolean hipertensao;
	@NotNull
	private Boolean gestante;
	@NotNull
	private Boolean praticaExerciciosFisico;
	@NotBlank
	private String dadosClinicos;
	

	@NotNull
	private LocalDate dataDaConsulta;
	@NotNull
	private LocalDate dataDoRetorno;
}
