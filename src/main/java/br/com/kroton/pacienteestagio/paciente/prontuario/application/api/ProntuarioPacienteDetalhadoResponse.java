package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;
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
	
	public ProntuarioPacienteDetalhadoResponse(Prontuario prontuario) {
		this.idProntuario = prontuario.getIdProntuario();
		this.nomeCompletoPaciente = prontuario.getNomeCompletoPaciente();
		this.objetivoDaConsulta = prontuario.getObjetivoDaConsulta();
		this.ritmoIntestinal = prontuario.getRitmoIntestinal();
		this.alergiaAlimentar = prontuario.getAlergiaAlimentar();
		this.usoDeMedicamento = prontuario.getUsoDeMedicamento();
		this.qualMedicamento = prontuario.getQualMedicamento();
		this.intoleranciaLactose = prontuario.getIntoleranciaLactose();
		this.alergiaProteinaDoLeite = prontuario.getAlergiaProteinaDoLeite();
		this.gastrite = prontuario.getGastrite();
		this.diabetes = prontuario.getDiabetes();
		this.hipertensao = prontuario.getHipertensao();
		this.gestante = prontuario.getGestante();
		this.praticaExerciciosFisico = prontuario.getPraticaExerciciosFisico();
		this.dadosClinicos = prontuario.getDadosClinicos();
		this.dataDaConsulta = prontuario.getDataDaConsulta();
		this.dataDoRetorno = prontuario.getDataDoRetorno();
	}
}
