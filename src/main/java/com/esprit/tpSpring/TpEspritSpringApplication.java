package com.esprit.tpSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
 

/**
 * @author Imtinen
 *
 */
@EnableScheduling
@EnableSwagger2
@EnableWebMvc
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@SpringBootApplication
public class TpEspritSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpEspritSpringApplication.class, args);
	}

}
