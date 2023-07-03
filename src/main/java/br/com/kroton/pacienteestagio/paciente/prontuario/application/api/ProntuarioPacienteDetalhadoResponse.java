package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.RitmoIntestinal;
import lombok.Value;

@Value
public class ProntuarioPacienteDetalhadoResponse {
	private UUID idProntuario;
	private String nomeCompletoPaciente;
	private String objetivoDaConsulta;
	private RitmoIntestinal ritmoIntestinal; 
	private Boolean alergiaAlimentar;
	private Boolean usoDeMedicamento;
	private String qualMedicamento;
	private Boolean intoleranciaLactose;
	private Boolean alergiaProteinaDoLeite;
	private Boolean gastrite;
	private Boolean diabetes;
	private Boolean hipertensao;
	private Boolean gestante;
	private Boolean praticaExerciciosFisico;
	private String dadosClinicos;
	private LocalDate dataDaConsulta;
	private LocalDate dataDoRetorno;
}
