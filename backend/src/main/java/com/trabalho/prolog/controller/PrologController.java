package com.trabalho.prolog.controller;

import com.trabalho.prolog.service.PrologService;
import com.trabalho.prolog.service.dto.ArquivoDTO;
import com.trabalho.prolog.service.dto.ConsultaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping("/consultar")
    public List<String> gerarConsulta(@RequestBody ConsultaDTO dto) {
        return prologService.gerarConsulta(dto);
    }
}
