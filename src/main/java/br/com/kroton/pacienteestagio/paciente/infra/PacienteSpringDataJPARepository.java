package br.com.kroton.pacienteestagio.paciente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kroton.pacienteestagio.paciente.domain.Paciente;

public interface PacienteSpringDataJPARepository extends JpaRepository<Paciente, UUID>{

}
