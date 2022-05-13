package com.trabalho.prolog.service;

import com.trabalho.prolog.service.dto.ArquivoDTO;
import com.trabalho.prolog.service.dto.ConsultaDTO;
import com.trabalho.prolog.util.ArquivoUtil;
import org.jpl7.Query;
import org.jpl7.Term;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PrologService implements ArquivoUtil {

    public void preencherBaseConhecimento(ArquivoDTO dto) {
        lerArquivo(dto.getArquivoXlsx(), dto.getArquivoPl());
    }

    public List<String> gerarConsulta(ConsultaDTO dto) {
        String arquivoProlog = "arquivos/arquivo-prolog.pl";
        Query q = new Query("consult('" + arquivoProlog + "')");
        q.hasSolution();
        q = new Query(dto.getConsulta());

        List<String> result = new ArrayList<>();
        Map<String, Term>[] solutions = q.allSolutions();

        for(int i = 0; i < solutions.length; i++) {
            if(!(solutions[i].isEmpty() || solutions.length == 0)) {
                result.add(solutions[i].get("X").toString());
            } else {
                result.add(solutions[i].toString());
            }
        }

        return result;
    }
}
