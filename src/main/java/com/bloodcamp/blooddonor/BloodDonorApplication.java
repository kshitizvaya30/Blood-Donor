package com.bloodcamp.blooddonor;

import com.bloodcamp.blooddonor.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class BloodDonorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorApplication.class, args);
	}

}
