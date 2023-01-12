package com.ust.kishon;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KishonProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(KishonProjectApplication.class, args);
		System.out.println("Hello");
	}

}
