package com.trabalho.prolog;

import org.jpl7.Query;
import org.jpl7.Term;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class PrologApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrologApplication.class, args);

		Query q = new Query("consult('arvore.pl')");
		q.hasSolution();

		q = new Query("gerou(X,Y).");

		Map<String, Term>[] res = q.allSolutions();

		for (Map<String, Term> re : res) {
			System.out.println(re);
		}
	}

}
