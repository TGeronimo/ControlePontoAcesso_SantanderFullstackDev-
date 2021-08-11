package com.diocontroledeponto.ControleDePontoEAcesso.controller;

import com.diocontroledeponto.ControleDePontoEAcesso.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // retorna uma lista de usuarios, por exemplo, como JSON
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @PostMapping
    public JornadaTrabalho createJornada() {
        return null; // null provisório
    }
}
