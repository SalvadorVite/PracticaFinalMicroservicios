package com.examenfinal.arquitecturamonitorserver;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ArquitecturaMonitorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaMonitorServerApplication.class, args);
	}

}
