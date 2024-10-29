package com.asodev.guzellix_api;

import com.asodev.guzellix_api.models.ERole;
import com.asodev.guzellix_api.models.Role;
import com.asodev.guzellix_api.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GuzellixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuzellixApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			RoleRepository roleRepository
	) {
		return args -> {
			roleRepository.save(new Role(ERole.ROLE_USER));
			roleRepository.save(new Role(ERole.ROLE_MODERATOR));
			roleRepository.save(new Role(ERole.ROLE_ADMIN));
		};
	}
}
