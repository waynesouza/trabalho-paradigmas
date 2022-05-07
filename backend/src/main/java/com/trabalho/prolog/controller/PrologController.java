package com.trabalho.prolog.controller;

import com.trabalho.prolog.service.PrologService;
import com.trabalho.prolog.service.dto.ArquivoDTO;
import com.trabalho.prolog.service.dto.ConsultaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jpl7.Term;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/prolog")
@Slf4j
@RequiredArgsConstructor

public class PrologController {

    private final PrologService prologService;

    @PostMapping
    public void preencherBaseConhecimento(@RequestBody ArquivoDTO dto) {
        prologService.preencherBaseConhecimento(dto);
    }

    @GetMapping("/consultar")
    public Map<String, Term>[] gerarConsulta(@RequestBody ConsultaDTO dto) {
        return prologService.gerarConsulta(dto);
    }
}
