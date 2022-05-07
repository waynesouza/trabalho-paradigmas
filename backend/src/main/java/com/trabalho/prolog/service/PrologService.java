package com.trabalho.prolog.service;

import com.trabalho.prolog.service.dto.ArquivoDTO;
import com.trabalho.prolog.service.dto.ConsultaDTO;
import com.trabalho.prolog.util.ArquivoUtil;
import org.jpl7.Query;
import org.jpl7.Term;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PrologService implements ArquivoUtil {

    public void preencherBaseConhecimento(ArquivoDTO dto) {
        lerArquivo(dto.getArquivoXlsx(), dto.getArquivoPl());
    }

    public Map<String, Term>[] gerarConsulta(ConsultaDTO dto) {
        Query q = new Query("consult('" + dto.getArquivoPl() + "')");
        q.hasSolution();
        q = new Query(dto.getConsulta());

        Map<String, Term>[] res = q.allSolutions();

        for (Map<String, Term> re : res) {
            System.out.println(re);
        }

        return res;
    }
}
