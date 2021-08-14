package com.diocontroledeponto.ControleDePontoEAcesso.controller;

import com.diocontroledeponto.ControleDePontoEAcesso.model.JornadaTrabalho;
import com.diocontroledeponto.ControleDePontoEAcesso.service.JornadaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.NoSuchElementException;

@RestController // retorna uma lista de usuarios, por exemplo, como JSON
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    @ApiOperation(value = "Cria uma jornada de trabalho")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    @ApiOperation(value = "Obtém lista de jornadas de trabalho")
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    @ApiOperation(value = "Obtém uma jornada de trabalho, de acordo com a ID informada")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws NoSuchElementException {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada!")));
    }

    @PutMapping
    @ApiOperation(value = "Atualiza um jornada de trabalho")
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    @ApiOperation(value = "Apaga a jornada de trabalho especificada pelo ID")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("idJornada") Long idJornada) throws NoSuchElementException {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
