package com.trabalho.prolog;

import com.trabalho.prolog.util.ArquivoUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrologApplication implements ArquivoUtil {

	public static void main(String[] args) {
		SpringApplication.run(PrologApplication.class, args);
	}
}
