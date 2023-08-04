package br.com.kroton.pacienteestagio.paciente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PacienteResponse {
	private UUID idPaciente;
}
