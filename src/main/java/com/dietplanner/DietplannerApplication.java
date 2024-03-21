package com.dietplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DietplannerApplication {

	public static void main(String[] args) {

		SpringApplication.run(DietplannerApplication.class, args);
	}


}
