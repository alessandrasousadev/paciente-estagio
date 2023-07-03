package br.com.kroton.pacienteestagio.paciente.prontuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kroton.pacienteestagio.paciente.prontuario.domain.Prontuario;

public interface ProntuarioSpringDataJPARepository extends JpaRepository<Prontuario, UUID>{
	List<Prontuario> findByIdPacienteTitular(UUID idPacienteTitular);
}
