package br.com.kroton.pacienteestagio.paciente.prontuario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;
import br.com.kroton.pacienteestagio.paciente.prontuario.domain.RitmoIntestinal;
import lombok.Value;

@Value
public class ProntuarioPacienteListResponse {
	private UUID idProntuario;
	private String nomeCompletoPaciente;
	private String objetivoDaConsulta;
	private RitmoIntestinal ritmoIntestinal; 
	private Boolean alergiaAlimentar;
	private Boolean usoDeMedicamento;
	private String qualMedicamento;
	private String dadosClinicos;
	private LocalDate dataDaConsulta;
	private LocalDate dataDoRetorno;


	
	
	public static List<ProntuarioPacienteListResponse> converte(List<Prontuario> prontuarioDoPaciente) {
		return prontuarioDoPaciente.stream()
				.map(ProntuarioPacienteListResponse::new)
				.collect(Collectors.toList());
	}


	public ProntuarioPacienteListResponse(Prontuario prontuario) {
		this.idProntuario = prontuario.getIdProntuario();
		this.nomeCompletoPaciente = prontuario.getNomeCompletoPaciente();
		this.objetivoDaConsulta = prontuario.getObjetivoDaConsulta();
		this.ritmoIntestinal = prontuario.getRitmoIntestinal();
		this.alergiaAlimentar = prontuario.getAlergiaAlimentar();
		this.usoDeMedicamento = prontuario.getUsoDeMedicamento();
		this.qualMedicamento = prontuario.getQualMedicamento();
		this.dadosClinicos = prontuario.getDadosClinicos();
		this.dataDaConsulta = prontuario.getDataDaConsulta();
		this.dataDoRetorno = prontuario.getDataDoRetorno();

	}
}
