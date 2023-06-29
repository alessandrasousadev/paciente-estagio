package br.com.kroton.pacienteestagio.paciente.prontuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.kroton.pacienteestagio.paciente.prontuario.application.api.ProntuarioRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idProntuario", updatable = false, unique = true, nullable = false)
	private UUID idProntuario;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idPacienteTitular",  nullable = false)
	private UUID idPacienteTitular;
	@NotBlank
	private String nomeCompletoPaciente;
	@NotNull
	private String objetivoDaConsulta;
	@Enumerated(EnumType.STRING )
	private RitmoIntestinal ritmoIntestinal; 
	@NotNull
	private LocalDate dataDaConsulta;
	@NotNull
	private LocalDate dataDoRetorno;
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
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Prontuario(UUID idPaciente, @Valid ProntuarioRequest prontuarioRequest) {
		this.idPacienteTitular = idPaciente;
		this.nomeCompletoPaciente = prontuarioRequest.getNomeCompletoPaciente();
		this.objetivoDaConsulta = prontuarioRequest.getObjetivoDaConsulta();
		this.ritmoIntestinal = prontuarioRequest.getRitmoIntestinal();
		this.alergiaAlimentar = prontuarioRequest.getAlergiaAlimentar();
		this.usoDeMedicamento = prontuarioRequest.getUsoDeMedicamento();
		this.qualMedicamento = prontuarioRequest.getQualMedicamento();
		this.intoleranciaLactose = prontuarioRequest.getIntoleranciaLactose();
		this.alergiaProteinaDoLeite = prontuarioRequest.getAlergiaProteinaDoLeite();
		this.gastrite = prontuarioRequest.getGastrite();
		this.diabetes = prontuarioRequest.getDiabetes();
		this.hipertensao = prontuarioRequest.getHipertensao();
		this.gestante = prontuarioRequest.getGestante();
		this.praticaExerciciosFisico = prontuarioRequest.getPraticaExerciciosFisico();
		this.dadosClinicos = prontuarioRequest.getDadosClinicos();
		this.dataDaConsulta = prontuarioRequest.getDataDaConsulta();
		this.dataDoRetorno = prontuarioRequest.getDataDoRetorno();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	
	
}
