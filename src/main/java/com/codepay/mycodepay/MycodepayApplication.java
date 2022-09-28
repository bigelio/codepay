package com.codepay.mycodepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class MycodepayApplication {
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MycodepayApplication.class, args);
	}

}
