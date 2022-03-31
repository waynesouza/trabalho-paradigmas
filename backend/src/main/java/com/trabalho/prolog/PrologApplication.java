package com.trabalho.prolog;

import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class PrologApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrologApplication.class, args);
		Query query = new Query("consult", new Term[] {
				new Atom("~/Documentos/ifmg/trabalho-paradigmas/arvore.pl")
		});
		query.hasSolution();

		Query q = new Query("gerou(ivo,X).");

		Map<String, Term>[] res = q.allSolutions();

		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
