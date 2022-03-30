package com.br.fiap.vacinas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.fiap.vacinas.repository.VacinaRepository;

@org.springframework.stereotype.Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    public VacinaRepository getVacinaRepository() {
        return vacinaRepository;
    }
}
