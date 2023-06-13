package br.com.kroton.pacienteestagio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PacienteEstagioApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Paciente Estagio - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PacienteEstagioApplication.class, args);
	}

}
