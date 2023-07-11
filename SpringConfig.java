package kr.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public Worker worker() {
		return new Worker();
	}
	
	@Bean
	public Clerk clerk() {
		return new Clerk();
	}
}
