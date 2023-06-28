package br.com.kroton.pacienteestagio.paciente.prontuario.domain;

import lombok.Value;

@Value
public class AnamnesePaciente {
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
}
